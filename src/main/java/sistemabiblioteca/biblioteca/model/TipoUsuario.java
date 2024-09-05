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

    public int getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(int tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
