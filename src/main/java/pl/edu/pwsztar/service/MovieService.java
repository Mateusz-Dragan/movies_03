package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.*;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    void creatMovie(CreateMovieDto createMovieDto);

    void deleteMovie(Long movieId);

    DetailsMovieDto findMovie(Long movieId);

    MovieCountDto countMovies();

    EditMovieDto editMovie(Long movieId, EditMovieDto editMovieDto);
}
