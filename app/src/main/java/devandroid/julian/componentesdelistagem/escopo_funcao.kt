package devandroid.julian.componentesdelistagem

class escopo_funcao {

    val nome = "executou"

}

var nome = "Escopo-Global" //Escopo Global (nao esta entre chaves {})

fun executar(){

    //var nome = "executou novo nome julian" //Escopo Local (esta entre chaves {})
    nome = "Escopo-Local"

}

//val nome = "executando"


fun main() {

    //executar()
    //nome = "Escopo-Local-Main"
    println(nome)
}