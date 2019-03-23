package com.twu.biblioteca;

import java.util.Scanner;

public class UserInputScanner implements UserInput {

    private final Scanner scanner;

    public String nextLine() {
        return scanner.nextLine();
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public UserInputScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
