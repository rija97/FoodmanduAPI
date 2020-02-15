const express = require('express');
const router = express.Router();
const more = require('../model/MoreAPI');

router.route('/')
.get((req,res,next)=>{
    more.find()
    .then((more)=>{
        res.json(more);
    }).catch(next);
})

.post((req,res,next)=>{
more.create(req.body)
.then((more)=>{
    res.json(more);
}).catch(next);
});

router.route('/:id/foods')
.get((req,res,next)=>{
    MoreAPI.findById(req.params.id)
    .then((more) =>{
    res.json(more.food);
}).catch(next);
})

.post((req,res)=>{
    MoreAPI.findById(req.params.id)
    .then((more) =>{
        more.food.push(req.body);
            more.save()
        .then((more) => {
    res.json(more);
    })
}).catch(next);
});

module.exports = router;