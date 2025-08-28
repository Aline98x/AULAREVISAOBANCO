package classes

fun menu(){
    println("1-Cadastrar Caixa D'Agua")
    println("2-Editar Caixa D'Agua")
    println("3-Listar Caixa D'Agua")
    println("4-Excluir Caixa D'Agua")
    println("0-Sair")

   val opcao = readln().toInt()

    when (opcao) {
        0-> println("Adeus amigo!")
        1-> println("Cadastrando Caixa...")
        2-> println("Editando Caixa...")
        3-> println("Listar Caixas...")
        4-> println("Excluindo Caixa...")
        5-> println("Saindo...")

    }



}