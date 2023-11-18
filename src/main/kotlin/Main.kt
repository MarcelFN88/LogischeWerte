fun main() {
    val a1 = true
    val a2 = false
    println("Logische Werte $a1 $a2\n")

    val x = 12;
    val y = 7;
    val z = 12
    val b1 = (x > y)
    val b2 = (x >= z)
    val b3 = (x == z)
    val b4 = (x != z)

    println("Zahlenvergleich: $b1 $b2 $b3 $b4")

    val s = "Guten Morgen";
    val t = "Hallo Welt"
    val b5 = (s == t)
    val b6 = (s != t)

    println("Textvergleich: $b5 $b6")

    val zahlGanzBereich = 10..17
    val c1 = (x in zahlGanzBereich)
    val c2 = (y in zahlGanzBereich)
    val c3 = (z in zahlGanzBereich)

    println("Ganzzahliger Bereich: $c1 $c2 $c3")

    val zahlKommaBereich = 10.8..16.2
    val c4 = (12.35 in zahlKommaBereich)

    println("Kommazahliger Bereich: $c4\n")

    val d1 = (x > y && x > z)
    val d2 = (x > y && z > y)
    val d3 = (y > x && x > z)

    println("Logisches Und: $d1 $d2 $d3")

    val d4 = (x > y || x > z)
    val d5 = (y > x || z < y)
    val d6 = (y > x || x > z)

    println("Logisches Oder: $d4 $d5 $d6")

    val d7 = ! (x > y)
    val d8 = (x > y && !(x > z))
    val d9 = !(x > y || x > z)

    println("Logisches Nicht: $d7 $d8 $d9")

}