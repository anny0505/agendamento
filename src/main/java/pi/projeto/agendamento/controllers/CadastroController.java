package pi.projeto.agendamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pi.projeto.agendamento.models.Cadastro;
import pi.projeto.agendamento.repository.CadastroRepository;

@Controller
public class CadastroController {
	
	@Autowired
	private CadastroRepository cr;
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		System.out.println("Chamou o cadastro");
		return "cadastro";
	} 
	
	@PostMapping("/cadastro")
	public String adicionarCadastro( Cadastro cadastro) {
		System.out.println("Cadastro adicionado");
		cr.save(cadastro);
		return "cadastro-adicionado";
	}

}
