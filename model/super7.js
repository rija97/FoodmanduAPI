const mongoose = require('mongoose');

const SuperSchema = new mongoose.Schema({

    name:{
        type:String,
        required:true
    },
    location:{
        type:String,
        required:true
    },
    itemtype:{
   type:String,
   required:true
    },
    image: {
        type:String,
        required:false
    },
    food:{
        type:String,
        required:false
    }
},{timestamps:true});

module.exports = mongoose.model('supers',SuperSchema);