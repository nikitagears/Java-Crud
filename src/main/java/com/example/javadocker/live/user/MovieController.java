package com.example.javadocker.live.user;

import com.example.javadocker.live.model.Movie;
import com.example.javadocker.live.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    @GetMapping("/{idMovie}")


    public Movie getMovieById(@PathVariable Integer idMovie) {
        return movieRepository.findById(idMovie).get();
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }


    @PutMapping("/{idMovie}")
    public Movie updateMovie(@PathVariable Integer idMovie, @RequestBody Movie movie) {
        Movie existingMovie = movieRepository.findById(idMovie).get();
        existingMovie.setTitle(movie.getTitle());
        return movieRepository.save(existingMovie);
    }


    @DeleteMapping("/{idMovie}")
    public String deleteMovie(@PathVariable Integer idMovie) {
        try {
            movieRepository.findById(idMovie).get();
            movieRepository.deleteById(idMovie);
            return "Movie deleted successfully";
        } catch (Exception e) {
            return "Movie not found";
        }
    }
}