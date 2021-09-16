const constants = require ('../constants');
const structureHouseImpl = require ('./impl/structureHouseImpl');

class Factory{
    async execute( event, callback ) {
        if (!constants.ACTIONS.includes(event.action)) {
            return callback('Unknown action in project.');
        }

        switch (event.platform) {
            case 'House':
                return await structureHouseImpl[event.action]( callback );
                break;
        
            default:
                return callback('Unknown operation');
        }

        callback('Something is wrong.');
    }
}

module.exports = new Factory();