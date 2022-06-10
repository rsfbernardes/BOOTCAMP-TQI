// using function
/*
var counter = document.getElementById("counter")
var number = 0

function decrease() {
    number = number - 1
    counter.innerHTML = number
}

function increase() {
    number = number + 1
    counter.innerHTML = number
}
*/

//using addEventListener

var color_counter = '#7CBE4F';
const element = document.getElementById("counter")
var counter = 0
const increaseButton = document.getElementById("increase")
const decreaseButton = document.getElementById("decrease")
const restartAll = document.getElementById("restart")

decreaseButton.addEventListener("click", decrease)
increaseButton.addEventListener("click", increase)
restartAll.addEventListener("click", restart)

function decrease() {
    counter = counter - 1
    element.innerHTML = counter
    if (counter < 0) {
        element.style.color = 'red'
    }
    else {
        element.style.color = color_counter
    }
    if (counter < -10) {
        alert('Minimum Number Reached! The button decrease will be disabled')
        counter = -10
        decreaseButton.disabled = true
        decreaseButton.style.transform = 'none';
        decreaseButton.style.marginTop = '0px';
        decreaseButton.style.fontSize = '7rem'
        element.innerHTML = counter
    }
}

function increase() {
    counter = counter + 1
    element.innerHTML = counter
    if (counter < 0) {
        element.style.color = 'red'
    }
    else {
        element.style.color = color_counter
    }
    if (counter > 10) {
        alert("Maximum Number Reached! The button increase will be disabled")
        counter = 10
        increaseButton.disabled = true
        increaseButton.style.transform = 'none'
        element.innerHTML = counter
    }
}

function restart () {
    location.reload()
}