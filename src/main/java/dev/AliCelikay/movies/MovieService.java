package dev.AliCelikay.movies;

import dev.AliCelikay.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
//    lets framework instantiate MovieRepository class for us
    @Autowired
    private MovieRepository MovieRepository;

    public List<Movie> allMovies() {
        return MovieRepository.findAll();
    }
}
