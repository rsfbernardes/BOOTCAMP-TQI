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
    const lightMode = "Light Mode ON"
    const darkMode = "Dark Mode ON"

    if (body.classList.contains(darkModeClass)) {
        h1.innerHtml = darkMode
        button.innerHtml = lightMode
        return
    }

    h1.innerHtml = lightMode
    button.innerHtml = darkMode
}

function toggle() {
    changeClass()
    changeText()
}

button.addEventListener("click", toggle)