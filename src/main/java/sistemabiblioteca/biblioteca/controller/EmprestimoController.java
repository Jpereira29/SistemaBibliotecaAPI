package sistemabiblioteca.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemabiblioteca.biblioteca.model.Emprestimo;
import sistemabiblioteca.biblioteca.repository.EmprestimoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Emprestimos")
@CrossOrigin(origins = "*")
public class EmprestimoController {
    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @GetMapping
    public ResponseEntity<List<Emprestimo>> listarTodos() {
        return new ResponseEntity<>(emprestimoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Emprestimo> criar(@RequestBody Emprestimo emprestimo) {
        return new ResponseEntity<>(emprestimoRepository.save(emprestimo), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> atualizar(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        Optional<Emprestimo> emprestimoExistente = emprestimoRepository.findById(id);

        if (emprestimoExistente.isPresent()) {
            Emprestimo atualizado = emprestimoExistente.get();

            atualizado.setDataEmprestimo(emprestimo.getDataEmprestimo());
            atualizado.setPrevisaoEntrega(emprestimo.getPrevisaoEntrega());
            atualizado.setUsuarioId(emprestimo.getUsuarioId());
            atualizado.setLivroId(emprestimo.getLivroId());

            emprestimoRepository.save(atualizado);
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        emprestimoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
