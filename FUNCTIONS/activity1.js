//  Activity 1: Aproved students

//     1 - Create a function that receive the array students and a number that will represent the final average
//     2 - Run through the array and populate a new step array with only the students which grades are higher or equal the  final average
//     3 - Use the "object destructuring" technique to manipulate the desired properties of each student

const students = [
    {
        name: 'João',
        grade: 5,
    },
    {
        name: 'Maria',
        grade: 7
    },
    {
        name: 'Tom',
        grade: 9,
    },
]

const FINAL_AVERAGE = 7

function average(array, average) {
    let aprovedStudents = []

    for (let i = 0; i < array.length; i++) {

        const { name, grade } = array[i]

        if (grade >= average) {
            aprovedStudents.push(name)
        }        
    }
    
    return aprovedStudents;
}

console.log(average(students, FINAL_AVERAGE))