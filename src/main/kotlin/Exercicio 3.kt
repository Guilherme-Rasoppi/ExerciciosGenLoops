fun main(args: Array<String>) {

    var nota = 0.0
    var totalNotas = 0.0
    var media = 0.0
    var i = 1

    while (i in 1..4){
        print("Digite sua nota: ")
        nota = readLine()!!.toDouble()
        totalNotas += nota
        i++
    }

    media = totalNotas / 4

    println("A média das suas notas são: $media")

}