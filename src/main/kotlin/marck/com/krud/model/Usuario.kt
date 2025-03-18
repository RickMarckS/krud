package marck.com.krud.model

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF


data class Usuario(
    @field:NotBlank(message = "Nome é obrigatório")
    val nome: String = "",

    @field:NotBlank(message = "Email é obrigatório")
    @field:Email(message = "Email inválido")
    val email: String = "",

    @field:NotBlank(message = "Cpf é obrigatório")
    @field:CPF(message = "Cpf inválido")
    val cpf: String = "",

    @field:NotBlank(message = "Senha é obrigatória")
    @field:Size(min = 6 , max = 18, message = "A senha deve ter entre 6 e 12 caracteres")
    val senha: String = "",


    val papel: String = "",

) {
}