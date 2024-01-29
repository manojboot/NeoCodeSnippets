package org.example.neo.json.related;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private String title;
    private int year;
    private String imdbId;
    private String genre;
    private String director;
    public List<String> cast;
}
