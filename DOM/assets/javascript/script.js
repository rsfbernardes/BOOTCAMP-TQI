const darkModeClass = "dark-mode";
const body = document.getElementsByTagName("body")[0]
const h1 = document.getElementById("page-title")
const button = document.getElementById("mode-selector")

function changeClass() {
    body.classList.toggle(darkModeClass)
    h1.classList.toggle(darkModeClass)
    button.classList.toggle(darkModeClass)
}

function changeText() {
    const lightMode = "Light Mode"
    const darkMode = "Dark Mode"

    if (body.classList.contains(darkModeClass)) {
        button.innerText = lightMode
        h1.innerText = darkMode + " ON"
        return
    }

    button.innerText = darkMode
    h1.innerText = lightMode + " ON"
}

function toggle() {
    changeClass()
    changeText()
}

button.addEventListener("click", toggle)