package sistemabiblioteca.biblioteca.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autorid")
    private int autorId;

    @NotNull
    @Column(name = "nome", length = 50)
    private String nome;

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
