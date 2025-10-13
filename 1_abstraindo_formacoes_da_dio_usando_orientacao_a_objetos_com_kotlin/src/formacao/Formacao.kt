package formacao

import usuario.Usuario

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
        } else {
            println("Usuário ${usuario.email} já está matriculado na formação $nome.")
        }
    }

    override fun toString(): String {
        return "Formacao(nome='$nome', nivel=$nivel, conteudos=$conteudos, inscritos=$inscritos)"
    }


}