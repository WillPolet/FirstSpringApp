package com.example.Exo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CommandLineTool {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a command (hello/time/exit): ");
            String input = scanner.nextLine().trim();

            if ("exit".equalsIgnoreCase(input)) {
                break; // Exit the loop and the program
            } else if ("hello".equalsIgnoreCase(input)) {
                Command helloCommand = (Command) context.getBean("helloCommand");
                helloCommand.execute();
            } else if ("time".equalsIgnoreCase(input)) {
                Command timeCommand = (Command) context.getBean("timeCommand");
                timeCommand.execute();
            } else {
                System.out.println("Unknown command. Try again.");
            }
        }

        scanner.close();
        ((ClassPathXmlApplicationContext) context).close(); // Close the Spring context
    }
}

