const express = require('express');
const Resturants = require('../model/spices');

const router = express.Router();

router.route('/')
    .get((req,res,next)=>{
        Resturants.find()
        .then((resturant)=>{
            res.json(resturant);
        }).catch(next);
})

.post((req,res,next)=>{
    Resturants.create(req.body)
    .then((resturant)=>{
        res.json(resturant);
    }).catch(next);
});

router.route('/:id/foods')
.get((req,res,next) =>{
    spices.findById(req.params.id)
    .then((resturant)=>{
        res.json(resturant.food);
    }).catch(next);
})

.post((req,res,next)=>{
    spices.findById(req.params.id)
        .then((resturant) =>{
            resturant.food.push(req.body);
                resturant.save()
            .then((resturant) => {
        res.json(resturant);
        })
    }).catch(next);
});

module.exports = router;