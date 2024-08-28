package sistemabiblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemabiblioteca.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
