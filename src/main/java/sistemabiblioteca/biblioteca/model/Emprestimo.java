package sistemabiblioteca.biblioteca.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emprestimoId;

    @NotNull
    private Date dataEmprestimo;

    @NotNull
    private Date previsaoEntrega;

    @NotNull
    private int usuarioId;

    @NotNull
    private int livroId;
}
