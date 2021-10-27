fun main(args: Array<String>) {

    var num = 0
    var par = 0
    var impar = 0
    var i = 1


    while(i <= 10){
        print("Digite um número: ")
        num = readLine()!!.toInt()
        i++

        if (num % 2 == 0){
            par++
        }else{
            impar++
        }
    }

    println("A quantidade de números pares é: $par" +
            "\nA quatidade de números impares é: $impar")

}