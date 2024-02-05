package org.example.neo.file.related;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingContentFromFileExample2 {

    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("C:\\Users\\pmano\\OneDrive\\Documents\\AWSCloudPractioner.txt"))
                .forEach(System.out::println);
    }
}
