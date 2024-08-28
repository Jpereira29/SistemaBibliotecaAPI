package sistemabiblioteca.biblioteca.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioId;

    @NotNull
    @Column(name = "nome", length = 50)
    private String nome;

    @NotNull
    @Column(name = "telefone1", length = 15)
    private String telefone1;

    @Column(name = "telefone2", length = 15)
    private String telefone2;

    @NotNull
    @Column(name = "email", length = 50)
    private String email;

    @NotNull
    private int tipoUsuario;
}
