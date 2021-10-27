fun main(args: Array<String>) {

    print("Digite a tabuada do 1 ao 10: ")
    var num = readLine()!!.toInt()

    for (i in 10 downTo 1){
        println("$num X $i = ${num * i}")
    }

}