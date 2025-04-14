package com.App.fawryTask.Service;

import com.App.fawryTask.Entity.Movies;
import com.App.fawryTask.Repsitory.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieService {
    private final RestTemplate restTemplate;

    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getDataFromApi(String url) {
        return restTemplate.getForObject(url, String.class);
    }

    @Autowired
    private MovieRepository movieRepository;
    public List<Movies>getAllMovies(){
        return movieRepository.findAll();
    }

     public List<Movies> getMovieByTitle(String Title){
         return movieRepository.findByTitle(Title);

     }
     public void addMovie(Movies movie){
         movieRepository.save(movie);
     }
      public void deleteMoviweById( int Id){
        movieRepository.deleteById(Id);
      }
}
