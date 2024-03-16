package collections

data class Frutas(var nome: String, var preco: Double)

fun main(args:Array<String>){
    var frutas = arrayListOf(Frutas("Bananas", 1.50), Frutas("Morango", 3.20))

    for (fruta in frutas){
        println("${fruta.nome} - ${fruta.preco}")
    }
}