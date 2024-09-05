package sistemabiblioteca.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemabiblioteca.biblioteca.model.Livro;
import sistemabiblioteca.biblioteca.repository.LivroRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Livros")
@CrossOrigin(origins = "*")
public class LivroController {
    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public ResponseEntity<List<Livro>> listarTodos() {
        return new ResponseEntity<>(livroRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Livro> criar(@RequestBody Livro livro) {
        return new ResponseEntity<>(livroRepository.save(livro), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody Livro livro) {
        Optional<Livro> livroExistente = livroRepository.findById(id);

        if (livroExistente.isPresent()) {
            Livro atualizado = livroExistente.get();

            atualizado.setTitulo(livro.getTitulo());
            atualizado.setCategoria(livro.getCategoria());
            atualizado.setAnoPublicacao(livro.getAnoPublicacao());
            atualizado.setAutorId(livro.getAutorId());

            livroRepository.save(atualizado);
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        livroRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
