package com.github.curriculeon.utils;

import java.io.PrintStream;
import java.util.Scanner;

public class InputOutputConsole implements InputOutputConsoleInterface {
    private Scanner input;
    private final PrintStream output;

    public InputOutputConsole(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public InputOutputConsole() {
        this(new Scanner(System.in), System.out);
    }

    @Override
    public void setScanner(Scanner scanner) {
        this.input = scanner;
    }

    @Override
    public PrintStream getPrintStream() {
        return output;
    }

    @Override
    public Scanner getScanner() {
        return input;
    }
}
