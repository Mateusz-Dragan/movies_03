package pl.edu.pwsztar.domain.dto;

public class MovieCountDto {
  private Long counter;

  public MovieCountDto() {
  }

  public void setCounter(Long counter) {
    this.counter = counter;
  }

  public Long getCounter() {
    return counter;
  }

  @Override
  public String toString() {
    return "DetailsMovieDto{" +
        "title='" + counter + '\'' +
        '}';
  }
}
