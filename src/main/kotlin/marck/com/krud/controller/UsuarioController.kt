package marck.com.krud.controller

import jakarta.validation.Valid
import marck.com.krud.model.Usuario
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class UsuarioController {


    @GetMapping("/formulario/cadastro")
    fun abrirFormularioCadastro(model: Model): String{

        val usuario: Usuario = Usuario()
        model.addAttribute("usuario", usuario)

        return "formulario-cadastro"
    }

    @PostMapping("/cadastrar")
    fun cadastrarUsuario(@Validated usuario: Usuario, result: BindingResult): String{

        if (result.hasErrors()){
            return "formulario-cadastro"
        }

        //salvar no bd
        println(usuario)

        return "home"
    }



}
