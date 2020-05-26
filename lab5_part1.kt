fun main()
{
    print("\nEnter your first number, x: ")
    val x = Integer.valueOf(readLine())

    print("\nEnter your next number, y: ")
    val y = Integer.valueOf(readLine())

    val result = compare(x, y)

    if(result == 1) {
        print("x is less than y!")
    }
    else if(result == -1) {
        print("x is greater than y!")
    }
    else {
        print("x is equal to y!")
    }
}

fun compare(x: Int, y: Int): Int
{
    if(x < y) {
        return 1
    }
    else if(x > y) {
        return -1
    }
    else {
        return 0
    }
}