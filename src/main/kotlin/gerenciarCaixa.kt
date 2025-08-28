import classes.enumeradores.Material

fun cadastrarCaixa(){
 /*val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val altura: Double,
    val profundidade : Double,
    val largura : Double,
    //val dimenssao : Array<Double>, //Altura, Profundidade e largura
    val material : String,
    val tamanho : String,
    val custoBeneficio: String,
    val ambiente : String,
    val tampa : String
 */
 println("Digite o material que a Caixa e composta")
    println("1-Plastico")
    println("2-Metal")
    println("3-PVC")
    println("4-Argamassa")
    val opcao = readln()
    var material : Material
    when (opcao) {
        1-> material = Material.PLASTICO
        2-> material = Material.METAL
        3-> material = Material.PVC
        else -> material = Material.ARGAMASSA

        println("Capacidade da Caixa em Litros")
            val litros = readln().toDouble()

        println("AZUL")
            val cor = readln().toDouble()

        println()    }
}
 fun editarCaixa(){

 }
fun listarCaixa(){}