package org.example.neo.json.related;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MovieCollectionReaderUsingJSONParser {

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        File file = new File("C:\\Users\\pmano\\OneDrive\\Desktop\\video.movies.json");
        JSONParser jsonParser = new JSONParser();
        JSONArray parser = (JSONArray) jsonParser.parse(new FileReader(file));
        for (Object object : parser){
            JSONObject jsonObject = (JSONObject) object;
            String movieGenre = (String) jsonObject.get(0);
            System.out.println(movieGenre);
        }

    }
}
