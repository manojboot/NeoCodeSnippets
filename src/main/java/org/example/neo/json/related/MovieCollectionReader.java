package org.example.neo.json.related;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MovieCollectionReader {

    public static void main(String[] args) throws IOException {

        // Convert Json array to Json Object using Jackson ObjectMapper and TypeRefrence
        File file = new File("C:\\Users\\pmano\\OneDrive\\Desktop\\video.movies.json");
        ObjectMapper objectMapper = new ObjectMapper();
        List<Movie> bookMark = objectMapper.readValue(file, new TypeReference<>() {});
        System.out.println(bookMark);
    }
}
