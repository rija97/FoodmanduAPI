const express = require('express');
const GroceriesItem = require('../model/GroceriesItem');

const router = express.Router();

router.route('/')
    .get((req,res,next)=>{
        GroceriesItem.find()
        .then((supers)=>{
            res.json(supers);
        }).catch(next);
})

.post((req,res,next)=>{
    GroceriesItem.create(req.body)
    .then((supers)=>{
        res.json(supers);
    }).catch(next);
});


router.route('/:id/foods')
.get((req,res,next) =>{
    GroceriesItem.findById(req.params.id)
    .then((supers)=>{
        res.json(supers.food);
    }).catch(next);
})

.post((req,res,next)=>{
    GroceriesItem.findById(req.params.id)
        .then((supers) =>{
            supers.food.push(req.body);
                supers.save()
            .then((supers) => {
        res.json(supers);
        })
    }).catch(next);
});

module.exports = router;