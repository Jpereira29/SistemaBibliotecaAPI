package sistemabiblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemabiblioteca.biblioteca.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
