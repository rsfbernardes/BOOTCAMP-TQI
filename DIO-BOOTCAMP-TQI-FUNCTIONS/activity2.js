// Activity 2: This
//     Given the function calculateAge, use the methods call and apply to modify the value of this.
//     Create your own objects for this activity
        
        function calculateAge(years) {
            return `${years} years from now, ${this.name} will have ${this.age + years} years old.`
        }

const PERSON_1 = {
    name: 'João',
    age: 20,
}

const PERSON_2 = {
    name: 'Maria',
    age: 40,
}

const PERSON_3 = {
    name: 'Rosa',
    age: 28,
}

console.log(calculateAge.call(PERSON_1, 100))
console.log(calculateAge.apply(PERSON_1, [100]))

console.log(calculateAge.call(PERSON_2, 100))
console.log(calculateAge.apply(PERSON_2, [100]))

console.log(calculateAge.call(PERSON_3, 100))
console.log(calculateAge.apply(PERSON_3, [100]))