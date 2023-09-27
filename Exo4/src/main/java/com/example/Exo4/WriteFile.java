package com.example.Exo4;

import java.io.FileWriter;
import java.io.IOException;

class writeFile {
    public static void write (String path,String firstName, String lastName, String doctor, String date){
        try {
            FileWriter myWriter = new FileWriter(path, true);
            myWriter.write(System.lineSeparator());
            String quote = firstName + "," + lastName + "," + doctor  + "," + date;
            myWriter.write(quote);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}