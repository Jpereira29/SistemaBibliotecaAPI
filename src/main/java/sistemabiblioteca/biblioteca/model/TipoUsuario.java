package sistemabiblioteca.biblioteca.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipoUsuarioId;

    @NotNull
    @Column(name = "tipo", length = 50)
    private String tipo;
}
