import java.io.File

fun main() {
    print("Enter the full name of the file you wish to read: ")
    val filename = readLine()

    File(filename).forEachLine {println(it) }
}