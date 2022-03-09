package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieCountDto;

@Component
public class MovieCountMapper {

  public MovieCountDto mapToDto(Long counter) {
    MovieCountDto movieCountDto = new MovieCountDto();
    movieCountDto.setCounter(counter);

    return movieCountDto;
  }

}
