package sistemabiblioteca.biblioteca.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int livroId;

    @NotNull
    @Column(name = "titulo", length = 50)
    private String titulo;

    @NotNull
    @Column(name = "categoria", length = 50)
    private String categoria;

    @NotNull
    @Column(name = "anoPublicacao", length = 4)
    private String anoPublicacao;

    @NotNull
    private int autorId;
}
