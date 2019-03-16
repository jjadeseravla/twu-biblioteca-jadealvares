package com.twu.biblioteca;

import java.util.Scanner;

public class ScannerFactory {
    private final ScannerFactory factory; //need to initialize when creating a Final field
    private final Scanner INSTANCE;

    public ScannerFactory() {
        factory = new ScannerFactory();
        INSTANCE = new Scanner(System.in);
    }

    public int nextInt() {
        return INSTANCE.nextInt();
    }

    public Scanner getInstance() {
        return INSTANCE;
    }
}
