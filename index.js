const express = require('express');
const mongoose = require('mongoose');
const resturantRouter = require('./routes/spices');
const super7Router = require('./routes/GroceriesItem');
const memeberRouter = require('./routes/mycart');
const sweetRouter  = require('./routes/VegetablesAPI');
const alcoholRouter = require('./routes/FruitsAPI');
const moreRouter = require('./routes/MoreAPI');
const dotenv = require('dotenv').config();
const uploadRouter = require('./routes/upload');
const userRouter = require('./routes/user');
const cors = require('cors')

mongoose.connect(process.env.DB,{useNewUrlParser:true, useUnifiedTopology:true, useCreateIndex:true}).then((db) =>
{
console.log("Sucessfully connected mongodb server");
})

const app = express();
app.options('*',cors());
app.use(cors());
app.use(express.urlencoded({ extended:true}));
app.use(express.static(__dirname + "/public"));

app.use(express.json());
app.use('/user',userRouter);
app.use('/upload', uploadRouter);
app.use('/spices',resturantRouter); 
app.use('/groceriesitem',super7Router); 
app.use('/mycart', memeberRouter);
app.use('/vegetables', sweetRouter);
app.use('/fruits', alcoholRouter);
app.use('/more',moreRouter);

app.listen(process.env.PORT, () => {
    console.log(`App is running at localhost:${process.env.PORT}`);
});

