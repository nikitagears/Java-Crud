package com.example.javadocker.live.user;

import java.util.List;

import com.example.javadocker.live.model.Genre;
import com.example.javadocker.live.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }


    @GetMapping("/{idGenre}")
    public Genre getGenreById(@PathVariable Integer idGenre) {
        return genreRepository.findById(idGenre).get();
    }

    @PostMapping
    public Genre createGenre(@RequestBody Genre character) {
        return genreRepository.save(character);
    }

    @PutMapping("/{idGenre}")
    public Genre updateGenre(@PathVariable Integer idGenre, @RequestBody Genre character) {
        Genre existingGenre = genreRepository.findById(idGenre).get();
        existingGenre.setGenre(character.getGenre());
        return genreRepository.save(existingGenre);
    }


    @DeleteMapping("/{idGenre}")
    public String deleteGenre(@PathVariable Integer idGenre) {
        try {
            genreRepository.findById(idGenre).get();
            genreRepository.deleteById(idGenre);
            return "Genre deleted successfully";
        } catch (Exception e) {
            return "Genre not found";
        }
    }
}