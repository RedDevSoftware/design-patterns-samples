const constants = require ('../constants');
const structureHouseImpl = require ('./impl/structureHouseImpl');

class Factory{
    async execute( event ) {
        const platFormFactory =  constants.PLATFORMS.hasOwnProperty(event.platform) ? constants.PLATFORMS[event.platform] : '';
        if (!platFormFactory) {
            return 'Unknown operation';
        }

        return await structureHouseImpl.getMaterials();
    }
}

module.exports = new Factory();