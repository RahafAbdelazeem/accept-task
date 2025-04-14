package com.App.fawryTask.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "movie1")
@Setter
@Getter
public class Movies {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")

     private Long Id;

     private String title;

    private  String  year;

    private String description;

     private int imdbId;

}
