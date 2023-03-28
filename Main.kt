package tasklist

class Task(private var text: String = "") {
    private val tasks = mutableListOf<Task>()

    //TODO провести рефакторинг этой функции
    fun addTaskList() {
        val task = Task()

        while (true) {
            val input = readln().trim()

            if (input == "" && task.text.trim().isNotEmpty()) {
                tasks.add(task)
                break
            }

            task.text += if (task.text.isEmpty()) input else "\n   $input"
            if (input == "" && task.text.trim().isEmpty()) {
                println("The task is blank")
                break
            }
        }
    }

    fun printTaskList() {
        if (tasks.isEmpty()) {
            println("No tasks have been input")
        } else printTasks(tasks)
    }

    override fun toString(): String {
        return text
    }
}
//TODO Сделать чтобы пустой ввод не добавлялся

fun chooseAction(task: Task) {
    while (true) {
        println("Input an action (add, print, end):")
        when (readln()) {
            "add" -> {
                println("Input a new task (enter a blank line to end):")
                task.addTaskList()
            }

            "print" -> task.printTaskList()

            "end" -> {
                println("Tasklist exiting!")
                break
            }

            else -> {
                println("The input action is invalid")
                continue
            }
        }
    }
}

fun printTasks(tasks: MutableList<Task>) {
    tasks.forEachIndexed { index, task ->
        println("${index + 1}".padEnd(3, ' ') + task + "\n")
    }
}

fun main() {
    val task = Task()
    chooseAction(task)
}