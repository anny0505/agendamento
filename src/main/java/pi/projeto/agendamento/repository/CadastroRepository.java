package pi.projeto.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pi.projeto.agendamento.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, String> {

}
