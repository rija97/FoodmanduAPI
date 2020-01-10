const express = require('express');
const User = require('../model/user');
const bcrypt = require('bcryptjs');
const jwt = require('jsonwebtoken');
const auth = require('../routes/auth');
const router = express.Router();


router.post('/register',(req, res, next)=>{

    User.findOne({username:req.body.username})
    .then((user) =>{
    
        if (user != null){
            let err = new Error('Username already exits');
            err.status = 401;
            return next(err);
    
        }
                bcrypt.hash(req.body.password, 10, function(err,hash){
            if(err){
                throw new Error('Could not encrypt password ');
            }
            User.create({ 
                firstname:req.body.firstName,
                lastname:req.body.lastName,
                phonenumber: req.body.phoneNumber, 
                username: req.body.username,
                password: hash
            }).then((user) =>{
                let token = jwt.sign({userId: user._id}, process.env.SECRET);
                res.json({status: "Signup Success!", token: token});
            })
        }).catch(next);
    })
    });

    router.post('/login', (req, res, next) => {
        User.findOne({ username: req.body.username })
            .then((user) => {
                if (user == null) {
                    let err = new Error('User not found!');
                    err.status = 401;
                    return next(err);
                }
                    bcrypt.compare(req.body.password, user.password,function(err,status){
                    
                            if (!status) {
                                let err = new Error('Password does not match!');
                                err.status = 401;
                                return next(err);
                            }
                            let token = jwt.sign({ userId: user._id }, process.env.SECRET);
                            res.json({ status: 'Login success!', token: token });
                        });
                        }).catch(next);
                
    });


    router.get('/me', auth.verifyUser, (req, res, next)=>{
        res.json({firstname: req.user.firstname, lastname: req.user.lastname,PhoneNumber: req.user.phonenumber, UserName: req.user.username })
        })
    
    module.exports = router;