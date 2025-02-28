package com.scaler.splitwisejul23;

import com.scaler.splitwisejul23.commands.CommandRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Splitwisejul23Application implements CommandLineRunner {
    private Scanner scanner;
    private CommandRegistry commandRegistry;

    @Autowired
    public Splitwisejul23Application(CommandRegistry commandRegistry) {
        scanner = new Scanner(System.in);
        this.commandRegistry = commandRegistry;
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            System.out.println("Tell what do you want to do?");
            String input = scanner.nextLine();
            commandRegistry.execute(input);
//            if (input.startsWith("UpdatePro"))
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Splitwisejul23Application.class, args);
        // ...
    }

}
