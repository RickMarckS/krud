package marck.com.krud.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UsuarioController {


    @GetMapping("/formulario/cadastro")
    fun abrirFormularioCadastro(): String{

        return "formulario-cadastro"
    }
}