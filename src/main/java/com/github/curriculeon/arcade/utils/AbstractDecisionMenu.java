package com.github.curriculeon.arcade.utils;

import com.github.curriculeon.utils.InputOutputConsole;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by leon on 2/25/2018.
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public abstract class AbstractDecisionMenu
        <SomeDecision extends Enum<SomeDecision> & DecisionInterface>
        implements MenuInterface<SomeDecision> {

    private final SomeDecision[] decisions;
    private final InputOutputConsole console;

    public AbstractDecisionMenu(SomeDecision[] decisions) {
        this.decisions = decisions;
        this.console = new InputOutputConsole(new Scanner(System.in), System.out);
    }

    @Override
    public SomeDecision[] getDecisions() {
        return decisions;
    }

    @Override
    public InputOutputConsole getConsole() {
        return console;
    }

    @Override
    public String toString() {
        return new StringJoiner("\n")
                .add(String.format("Welcome to the %s !", getClass().getSimpleName()))
                .add("From here you can select any of the following options:")
                .add(Arrays.toString(decisions))
                .toString();
    }
}
