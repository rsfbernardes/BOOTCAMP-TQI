do {
    var numberOne = Number(prompt("Type the value of the first number:\nMust be a number!"))
}while(isNaN(numberOne) || numberOne === null || numberOne === '')

do {
    var numberTwo = Number(prompt("Type the value of the second number:\nMust be a number"))
}while(isNaN(numberTwo) || numberTwo === null || numberTwo === '')

const RESULT = numberOne + numberTwo;
var output = ""

compareTwoNumbers()

function compareTwoNumbers() {
    if (numberOne === numberTwo) {
        output = `The numbers ${numberOne} and ${numberTwo} are the same. `
    }
    else {
        output = `The numbers ${numberOne} and ${numberTwo} are not the same. `
    }

    output += `Their sum is ${RESULT}, `

    if ( RESULT < 10) {
        output += `that is lower than 10 `
    }
    else if (RESULT == 10) {
        output += `that is equal to 10 `
    }
    else {
        output += `that is higher than 10 `
    }

    if ( RESULT < 20) {
        output += `and is lower than 20.`
    }
    else if (RESULT == 20) {
        output += `and is equal to 20.`
    }
    else {
        output += `and is higher than 20.`
    }

    alert(output)
}