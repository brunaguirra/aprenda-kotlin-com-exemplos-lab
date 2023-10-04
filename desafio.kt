// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)



enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val nome: String, val nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //  TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuarios  = listOf(
        Usuario("ana", Nivel.BASICO),
        Usuario("rodrigo", Nivel.BASICO),
        Usuario("amanda", Nivel.INTERMEDIARIO),
    )

    val conteudoEducacional = listOf(
        ConteudoEducacional ("ELA1", duracao = 120),
        ConteudoEducacional ("CE2"),
        ConteudoEducacional ("FT2", 80)
    )

    val formacao = Formacao("Back", conteudoEducacional )

    usuarios.forEach {
        formacao.matricular(it)
    }

    formacao.inscritos.forEach {
        println("O usuario ${it.nome} de nivel ${it.nivel}, esta matriculado!")
    }

    //  TO DO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //  TO DO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}