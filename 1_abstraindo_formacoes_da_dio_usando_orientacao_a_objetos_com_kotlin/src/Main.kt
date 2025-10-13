import formacao.ConteudoEducacional
import formacao.Formacao
import formacao.Nivel
import usuario.Email
import usuario.Usuario

fun main(){
    val user1 = Usuario(nome = "Kaio", email = Email("kaio.stavaress@gmail.com"))
    val use2 = Usuario("Usuario2", Email("usuario2@email.com"))
    val user3 = Usuario("Usuario3", Email("usuario3@email.com"))

    val kotlinFundamentos = ConteudoEducacional(
        nome = "Kotlin Fundamentos",
        duracaoMinutos = 600
    )
    val ferramentasFluxoTrabalhoAndroid = ConteudoEducacional(
        nome = "Ferramentas e Fluxo de Trabalho Android",
        duracaoMinutos = 300
    )

    val praticandoComKotlin = ConteudoEducacional("Praticando com Kotlin")

   val construindoAppsEscalaveis = ConteudoEducacional(
       nome = "Construindo Apps Escaláveis",
       duracaoMinutos = 480
   )

    val mobileDeveloperCognizant = Formacao(
        nome = "Mobile Developer Cognizant",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(
            kotlinFundamentos,
            ferramentasFluxoTrabalhoAndroid,
            praticandoComKotlin,
            construindoAppsEscalaveis
        )
    )

    mobileDeveloperCognizant.matricular(user1)
    mobileDeveloperCognizant.matricular(user1)
    mobileDeveloperCognizant.matricular(use2)
    mobileDeveloperCognizant.matricular(user3)
    println(mobileDeveloperCognizant)
}