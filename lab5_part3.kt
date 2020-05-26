fun main() {
    print("How many cardPoints do you have? ")
    var cardPoints = Integer.valueOf(readLine())
/*
    // TODO: replace this if with a when
    // try to use  ranges!

    val cardLevel: String = if (cardPoints >= 0 && cardPoints < 1000) {
        "pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5_000) {
        "silver"
    } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
        "gold"
    } else {
        "platinum"
    }

 */
    val cardLevel: String

    when(cardPoints) {
        in Int.MIN_VALUE..-1 -> cardLevel = "broke"
        in 0..999 -> cardLevel = "pearl"
        in 1000..4999 -> cardLevel = "silver"
        in 5000..9999 -> cardLevel = "gold"
        else -> cardLevel = "platinum"
    }

    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}
