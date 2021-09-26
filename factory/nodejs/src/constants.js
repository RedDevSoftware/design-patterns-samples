function define ( name, value ) {
    Object.defineProperty ( exports, name, {
        value :      value,
        enumerable : true
    } );
}


define ( 'HOUSE_MATERIALS', ['Material AC','Material AB','Material AD'] )
define ( 'ACTIONS', ["getMaterials"] );