package sistemabiblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemabiblioteca.biblioteca.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
