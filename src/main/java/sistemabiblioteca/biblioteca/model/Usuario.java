package sistemabiblioteca.biblioteca.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioid")
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
    @Column(name = "tipousuario")
    private int tipoUsuario;

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
