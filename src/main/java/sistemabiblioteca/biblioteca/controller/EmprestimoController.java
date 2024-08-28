package sistemabiblioteca.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemabiblioteca.biblioteca.model.Emprestimo;
import sistemabiblioteca.biblioteca.repository.EmprestimoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/Emprestimos")
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        emprestimoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
