const mongoose = require ('mongoose');
const alcoholSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    price: {
        type: String,
        required: true
    },
    itemtype:{
        type: String,
        required: true
    },
    image: {
        type:String,
        required:false
    },
    food: {
        type:String,
        required:false
    }
    },{timestamps:true});

module.exports = mongoose.model('FruitsAPI',alcoholSchema);