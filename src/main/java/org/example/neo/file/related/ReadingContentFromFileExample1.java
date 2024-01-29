package org.example.neo.file.related;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingContentFromFileExample1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\pmano\\OneDrive\\Documents\\AWSCloudPractioner.txt");
        Scanner sc = new Scanner(file);
        while ((sc.hasNext()))
        {
            System.out.println(sc.nextLine());
        }

    }
}
