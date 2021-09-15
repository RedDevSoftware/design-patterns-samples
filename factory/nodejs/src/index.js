const factory = require ('./factory/factory');

const handler = async ( event ) => {
    console.log( 'Received event:', event );
    return await factory.execute( event );
};


const event = {
    "platform": "House", // Build platform 
    "action": "Init" // Values is Init || Stop
};

handler(event).then((data) => {
    console.log(data);
}).catch((err) => {
    console.error(err);
});