// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        if (usuario !in inscritos) inscritos.add(usuario)
    }

    fun getInscritos(): List<Usuario> {
        return inscritos.toList()
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val conteudos = mutableListOf<ConteudoEducacional>()

    conteudos.add(
        ConteudoEducacional(nome = "Conhecendo Kotlin e sua documentação oficial", duracao = 60, Nivel.BASICO)
    )

    conteudos.add(
        ConteudoEducacional(nome = "Introdução prática à Linguagem de programação Kotlin", duracao = 120, Nivel.BASICO)
    )

    conteudos.add(
        ConteudoEducacional(nome = "Estrutura de controle de fluxo e coleções em Kotlin", duracao = 120, Nivel.BASICO)
    )

    conteudos.add(
        ConteudoEducacional(
            nome = "Orientação a Objetos e Tipos de Classes na Prática com Kotlin",
            duracao = 120,
            Nivel.INTERMEDIARIO
        )
    )

    conteudos.add(
        ConteudoEducacional(nome = "O poder das funções em Kotlin", duracao = 60, Nivel.DIFICIL)
    )

    conteudos.add(
        ConteudoEducacional(
            nome = "Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin",
            duracao = 120,
            Nivel.DIFICIL
        )
    )

    val formacao = Formacao("Kotlin Experience", conteudos)

    formacao.conteudos.map { println("${it.nome} possui duracao de ${it.duracao} minutos com o " +
            "nível de dificuldade ${it.nivel}") }

    formacao.matricular(Usuario("Tony"))
    formacao.matricular(Usuario("Steve"))
    formacao.matricular(Usuario("Bruce"))
    formacao.matricular(Usuario("Stephen"))

    formacao.getInscritos().map { println(it.nome) }
}
