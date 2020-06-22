package com.github.curriculeon.utils;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by leon on 6/22/2020.
 */
public class MockInputOutputConsole extends InputOutputConsole {
    public MockInputOutputConsole(Scanner input, PrintStream output) {
        super(input, output);
    }

    /**
     * Used to inject buffered-string into a console for testing purposes
     */
    public InputOutputConsole append(String val, Object... args) {
        StringBuilder bufferedText = new StringBuilder();
        do {
            bufferedText.append(getScanner().nextLine());
        } while(getScanner().hasNext());
        String inputString = bufferedText.toString();
        byte[] inputBytes = inputString.getBytes();
        ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
        Scanner scanner = new Scanner(inputByteArray);
        super.setScanner(scanner);
        return new InputOutputConsole(getScanner(), getPrintStream());
    }
}
