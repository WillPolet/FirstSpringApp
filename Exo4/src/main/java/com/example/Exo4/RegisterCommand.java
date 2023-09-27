package com.example.Exo4;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

//@Component
public class RegisterCommand implements Command {
    @Override
    public void execute(){
        Scanner scanner = new Scanner(System.in);

//        System.out.println("something");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Choose between these two doctors : \"Jonh Murphy\" or \"Sebastian Melandez\", if you here there for a visit, enter nothing.");
        String doctor = scanner.nextLine().trim();
        while (!Objects.equals(doctor, "Jonh Murphy") && !Objects.equals(doctor, "Sebastian Melandez") && !Objects.equals(doctor, "")){
            System.out.println("Enter a valid name, or nothing please");
            doctor = scanner.nextLine().trim();
        }
        if (doctor.equals("")){
            doctor = "visit a patient";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeOfVisit = sdf.format(new Date());
        String path = "C:\\Users\\willi\\Desktop\\JavaBeCode\\weekFour\\Exo4\\src\\main\\resources\\entries.csv";
        writeFile.write(path, firstName, lastName,doctor, timeOfVisit);
    }
}
