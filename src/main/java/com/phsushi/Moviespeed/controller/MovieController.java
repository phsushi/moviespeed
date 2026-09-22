package com.phsushi.Moviespeed.controller;

import com.phsushi.Moviespeed.model.Movie;
import com.phsushi.Moviespeed.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviespeed")
public class MovieController {

   private final MovieService movieService;

   MovieController(MovieService movieService){
       this.movieService = movieService;
   }


   @GetMapping
   public List<Movie> getAllMovies(){
       return movieService.getAllMovies();
   }

   @PostMapping
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
   }

   @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
   }
}
