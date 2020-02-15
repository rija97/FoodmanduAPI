const express = require('express');
const router = express.Router();
const sweet = require('../model/VegetablesAPI');

router.route('/')
.get((req,res,next)=>{
    sweet.find()
    .then((sweets)=>{
        res.json(sweets);
    }).catch(next);
})

.post((req,res,next)=>{
sweet.create(req.body)
.then((sweets)=>{
    res.json(sweets);
}).catch(next);
});

router.route('/:id/foods')
.get((req,res,next)=>{
    VegetablesAPI.findById(req.params.id)
    .then((sweets) =>{
    res.json(sweets.food);
}).catch(next);
})

.post((req,res)=>{
    VegetablesAPI.findById(req.params.id)
    .then((sweet) =>{
        sweet.food.push(req.body);
            sweet.save()
        .then((sweet) => {
    res.json(sweet);
    })
}).catch(next);
});

module.exports = router;