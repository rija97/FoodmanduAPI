const express = require('express');
const router = express.Router();
const alcohol = require('../model/FruitsAPI');

router.route('/')
.get((req,res,next)=>{
    alcohol.find()
    .then((alcohol)=>{
        res.json(alcohol);
    }).catch(next);
})

.post((req,res,next)=>{
alcohol.create(req.body)
.then((alcohol)=>{
    res.json(alcohol);
}).catch(next);
});

router.route('/:id/foods')
.get((req,res,next)=>{
    FruitsAPI.findById(req.params.id)
    .then((alcohol) =>{
    res.json(alcohol.food);
}).catch(next);
})

.post((req,res)=>{
    FruitsAPI.findById(req.params.id)
    .then((alcohol) =>{
        alcohol.food.push(req.body);
            alcohol.save()
        .then((alcohol) => {
    res.json(alcohol);
    })
}).catch(next);
});

module.exports = router;