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

    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }
}
