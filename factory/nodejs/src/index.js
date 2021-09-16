const factory = require ('./factory/factory');

const handler = async ( event, callback ) => {
    console.log( 'Received event:', event );
    await factory.execute( event, callback );
};



// Test
const event = {
    "platform": "House", // Build platform 
    "action": "getMaterials" // Values is getMaterials, 
};

handler(event, (data) => {
    console.log(data);
}).catch((err) => {
    console.error(err);
});