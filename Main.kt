package tasklist

fun main() {
    val taskContainer = HashMap<Int, String>()
    var taskNumber = 1
    println("Input the tasks (enter a blank line to end):")
    while (true) {
        val task = readln().trim()
        if (taskNumber == 1 && task == "") {
            println("No tasks have been input")
        }
        if (task == "") {
            break
        }
        taskContainer[taskNumber] = task
        taskNumber++
    }
    printTasks(taskContainer)
}

fun printTasks(tasks: HashMap<Int, String>) {
    for ((key, value) in tasks) {
        println(key.toString().padEnd(3, ' ') + value)
    }
}


