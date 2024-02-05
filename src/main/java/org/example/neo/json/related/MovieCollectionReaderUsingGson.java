package org.example.neo.json.related;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieCollectionReaderUsingGson {

    public static void main(String[] args) {

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Movie>>(){}.getType();
        try(Reader jsonFile = new FileReader("C:\\Users\\pmano\\OneDrive\\Desktop\\video.movies.json")){
            List<Movie> movie = gson.fromJson(jsonFile,listType);
            System.out.println(movie.stream().map(Movie::getDirector).collect(Collectors.toList()));
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
