const constants = require ('../../constants');

exports.getMaterials = async () => {
    let result = {
        platform: "House",
        materials: []
    };
    constants.HOUSE_MATERIALS.forEach(element => {
        result.materials.push({
            name: element,
            cant: Math.floor(
                Math.random() * (100 - 1 + 1) + 1
            )
        });
    });
    
    return result;
};