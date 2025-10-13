package usuario

class Usuario(val nome: String, val email: Email) {
    override fun toString(): String {
        return "Usuario(nome='$nome', email=$email)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Usuario

        return email == other.email
    }

    override fun hashCode(): Int {
        return email.hashCode()
    }

}