package com.example.Exo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a command (register/report/exit): ");
            String input = scanner.nextLine().trim();

            if ("exit".equalsIgnoreCase(input)) {
                break; // Exit the loop and the program
            } else if ("register".equalsIgnoreCase(input)) {
                Command registerCommand = (Command) context.getBean("registerCommand");
                registerCommand.execute();
            } else if ("report".equalsIgnoreCase(input)) {
                Command reportCommand = (Command) context.getBean("reportCommand");
                reportCommand.execute();
            } else {
                System.out.println("Unknown command. Try again.");
            }
        }

        scanner.close();
        ((ClassPathXmlApplicationContext) context).close(); // Close the Spring context
    }
}
