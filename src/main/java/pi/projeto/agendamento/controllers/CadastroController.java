package pi.projeto.agendamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		System.out.println("Chamou o cadastro");
		return "cadastro";
	}

}
