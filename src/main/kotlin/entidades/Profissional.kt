package entidades

import classes.enumeradores.Setor

class Profissional {

    class Profissional(

        nome: String,
        contato: Long,
        val funcao: String,
        val experiencia: String,
        val idade: Int,
        val salario: Double,
        sexo: String,
        cpf: Long,
        val id: Int,
        endereco: String,
        habilidade: String,
        setor: Setor,


        ) : Pessoa(
        nome = nome,
        cpf = cpf,
        contato = contato,
        endereco = endereco,
        sexo = sexo,
        habilidade = habilidade,
        setor = setor
    )

    {

        //Comportamentos do Profissional
        fun instalarCaixaDAgua(clt: Profissional) {
            if (clt.setor.equals(Setor.MONTAGEM)) {
                println("Profissional habilitado")
            } else {
                println("Profissional Desqualificado")

            }

        }
    }
}