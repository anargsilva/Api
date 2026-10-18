package med.voll.api.saudacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Essa classe vai ser responsável por receber requisições HTTP e devolver dados.
@RestController

//usado para definir um caminho base para o Controller.
@RequestMapping("/saudacao")


public class SaudacaoController {

 //O GET normalmente é utilizado para buscar/consultar informações.
    @GetMapping
   public String saudacao(){
       return "Hello, how are you today im learning Spring bot";
   }

}
