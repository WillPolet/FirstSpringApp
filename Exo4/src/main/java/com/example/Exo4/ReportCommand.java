package com.example.Exo4;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class ReportCommand implements Command{
    @Override
    public void execute(){
        ReadFile readFile = new ReadFile();
        List<person> personRegisteredInFile = readFile.toObject("C:\\Users\\willi\\Desktop\\JavaBeCode\\weekFour\\Exo4\\src\\main\\resources\\entries.csv");
        for (person person:personRegisteredInFile
             ) {
            person.print();
        }
    }


}
