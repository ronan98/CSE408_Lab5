fun main() {
    print("Enter an age: ")
    var age = Integer.valueOf(readLine())

    when(age) {
        in 0..20 -> print("$age is part of the age group: Family")
        in 21..59 -> print("$age is part of the age group: Normal")
        in 60..100 -> print("$age is part of the age group: Senior")
        else -> print("Invalid age entered.")
    }
}