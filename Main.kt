package tasklist

fun main() {
    val tasks = mutableListOf<String>()
    println("Input the tasks (enter a blank line to end):")
    while (true) {
        val task = readln().trim()
        if (tasks.isEmpty() && task.isEmpty()) {
            println("No tasks have been input")
            break
        }
        if (task.isEmpty()) break
        tasks.add(task)
    }
    printTasks(tasks)
}

fun printTasks(tasks: List<String>) {
    tasks.forEachIndexed { index, task ->
        println("${index + 1}".padEnd(3, ' ') + task)
    }
}

