fun main(args: Array<String>){
    println("Digite o primeiro número: ")
    val X = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X, Y)

    println("O resultaddo da soma é = $resultado")
}

fun multiplica(X:Int, Y:Int):Int{
    return X + Y
}