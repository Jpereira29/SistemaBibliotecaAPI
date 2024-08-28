package sistemabiblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemabiblioteca.biblioteca.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
