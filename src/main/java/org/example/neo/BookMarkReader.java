package org.example.neo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class BookMarkReader {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\pmano\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Bookmarks.bak");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map
                = objectMapper.readValue(json, new TypeReference<Map<String,Object>>(){});
        System.out.println(map);
    }
}
