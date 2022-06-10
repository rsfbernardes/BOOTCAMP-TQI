const FORM = document.querySelector("#add-input")
const TASKLIST = document.querySelector("#task-list")
const INPUTTASK = document.getElementById("task-input")

FORM.addEventListener("click", function(e) {
    e.preventDefault()
    if (INPUTTASK.value === "") {
        alert("You must write a task first!")
    }
    else {
        addTask(INPUTTASK.value)
        const BLANK = INPUTTASK.value = ""
        INPUTTASK.innerHTML = BLANK
    }
})

function addTask(task) {
    const TASKCONTAINER = document.createElement("div")
    const NEWTASK = document.createElement("input")
    const TASKLABEL = document.createElement("label")
    const TASKNODE = document.createTextNode(task)

    TASKCONTAINER.classList.add("task-item")
    TASKCONTAINER.appendChild(NEWTASK)
    TASKCONTAINER.appendChild(TASKLABEL)

    NEWTASK.setAttribute("type", "checkbox")
    NEWTASK.setAttribute('name', task)
    NEWTASK.setAttribute('id', task)

    TASKLABEL.setAttribute("for", task)
    TASKLABEL.appendChild(TASKNODE)

    TASKLIST.appendChild(TASKCONTAINER)
}