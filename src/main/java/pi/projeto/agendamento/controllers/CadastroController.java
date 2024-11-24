package pi.projeto.agendamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pi.projeto.agendamento.models.Cadastro;

@Controller
public class CadastroController {
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		System.out.println("Chamou o cadastro");
		return "cadastro";
	} 
	
	@PostMapping("/cadastro")
	public String adicionarCadastro( Cadastro cadastro) {
		System.out.println("Cadastro adicionado");
		return "cadastro-adicionado";
	}

}
