function validationErrors(array, arrayLength) {
    try {
        if (!array && !arrayLength) {
            throw new ReferenceError ("The function must have two arguments")
        }
    
        if (typeof(array) !== 'object') {
            throw new TypeError(`${array} must be of the type Object`)
        }
    
        if (typeof(arrayLength) !== 'number') {
            throw new TypeError(`${arrayLength} must be of the type Number`)
        }
    
        if (array.length !== arrayLength) {
            throw new RangeError(`The size of the array must be equal of the number`)
        }

        return array
    }
    catch (e) {
        if (e instanceof ReferenceError) {
            console.log(e.message)
            console.log(e.name)
            // console.log(e.stack)
        }
        else if (e instanceof TypeError) {
            console.log(e.message)
            console.log(e.name)
            // console.log(e.stack)
        }
        else if (e instanceof RangeError) {
            console.log(e.message)
            console.log(e.name)
            // console.log(e.stack)
        }
        else {
            console.log("Tipo de erro não esperado: " + e)
        }
    }
}

console.log(validationErrors([5], 1))