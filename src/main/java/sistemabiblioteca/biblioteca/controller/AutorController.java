package sistemabiblioteca.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemabiblioteca.biblioteca.model.Autor;
import sistemabiblioteca.biblioteca.repository.AutorRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Autores")
@CrossOrigin(origins = "*")
public class AutorController {
    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public ResponseEntity<List<Autor>> listarTodos() {
        return new ResponseEntity<>(autorRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Autor> criar(@RequestBody Autor autor) {
        return new ResponseEntity<>(autorRepository.save(autor), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> atualizar(@PathVariable Long id, @RequestBody Autor autor) {
        Optional<Autor> autorExistente = autorRepository.findById(id);

        if (autorExistente.isPresent()) {
            Autor atualizado = autorExistente.get();

            atualizado.setNome(autor.getNome());

            autorRepository.save(atualizado);
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        autorRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
