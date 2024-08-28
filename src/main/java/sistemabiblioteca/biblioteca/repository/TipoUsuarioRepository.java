package sistemabiblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemabiblioteca.biblioteca.model.Autor;

public interface TipoUsuarioRepository extends JpaRepository<Autor, Long> {
}
