const Register = require('../../model/user');

const mongoose = require('mongoose');

const testDB = 'mongodb://127.0.0.1/HomeGrocery_test'

beforeAll(async()=>{
    mongoose.connect(testDB,{
    userNewUrlParser:true,
    useUnifiedTopology: true,
    useCreateIndex:true,
    useFindAndModify: false
    })

})
afterAll(async() => {
await mongoose.connection.dropDatabase();
await mongoose.connection.close();

})

test('should add a new user',() =>{
return Register.create({
    
    firstname:'Sita',
    lastname:'Ram',
    phonenumber:'45654515',
    username:'sita123',
    password:'sita123',
    image:'reeza'
}).then((Response)=>{
   
    expect(Response.firstname).toBe('Sita')
    expect(Response.lastname).toBe('Ram')
    expect(Response.phonenumber).toBe('45654515')
    expect(Response.username).toBe('sita123')
    expect(Response.password).toBe('sita123')
    expect(Response.image).toBe('reeza')

})
})

test('should update the category',()=>{
    return Register.findOne({'firstname':'Sita'})
    .then((user)=>{
      
        user.firstname ='Sita',
        user.lastname ='Ram',
        user.phonenumber ='45654515',
        user.username = 'sita123',
        user.password ='sita123',
        user.image = 'reeza',
        user.save().then((updateduser)=>{
           
            expect(Response.firstname).toBe('Sita')
            expect(Response.lastname).toBe('Ram')
            expect(Response.phonenumber).toBe('45654515')
            expect(Response.username).toBe('sita123')
            expect(Response.password).toBe('sita123')
            expect(Response.image).toBe('reeza')

        })

    })
})