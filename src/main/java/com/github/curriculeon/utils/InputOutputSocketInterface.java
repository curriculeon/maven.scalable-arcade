package com.github.curriculeon.utils;

/**
 * Created by leon on 6/25/2020.
 */
public interface InputOutputSocketInterface {
    default InputOutputConsoleInterface getConsole() {
        return new InputOutputConsole();
    }
}
