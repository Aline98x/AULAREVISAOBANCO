package entidades

class Cliente {

    open class Pessoa(
        val nome: String,
        val cpf: Long,
        val contato: Long,
        val sexo: String,
        val endereco: String,
        val habilidade: String,
        val setor: Setor,
    )

    {

    }

}