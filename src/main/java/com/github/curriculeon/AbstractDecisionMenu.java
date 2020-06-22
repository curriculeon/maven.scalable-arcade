package com.github.curriculeon;

import com.github.curriculeon.utils.InputOutputConsole;
import com.github.curriculeon.utils.StringUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by leon on 2/25/18.
 */
public abstract class AbstractDecisionMenu<SomeDecision extends Enum<SomeDecision> & DecisionInterface> implements MenuInterface {
    private final SomeDecision[] decisions;
    private final InputOutputConsole console;

    public AbstractDecisionMenu(SomeDecision[] decisions) {
        this.decisions = decisions;
        this.console = new InputOutputConsole(new Scanner(System.in), System.out);
    }

    public String getInputFromUser() {
        String border = StringUtils.repeatString("-", 50);
        console.println(border);
        display();
        return console
                .getStringInput("Select an option.")
                .toUpperCase();
    }

    public final void display() {
        console.println(toString());
    }

    public String toString() {
        return new StringJoiner("\n")
                .add(String.format("Welcome to the %s !", getClass().getSimpleName()))
                .add("From here you can select any of the following options:")
                .add(Arrays.toString(decisions))
                .toString();
    }

    @SuppressWarnings("all")
    public SomeDecision getValueOf(String userInput) {
        return (SomeDecision) SomeDecision.valueOf(decisions[0].getClass(), userInput
                .replace(" ", "_")
                .toUpperCase());
    }

    public final SomeDecision getInput() {
        return getValueOf(getInputFromUser());
    }

    public void handleIllegalArgument(String input) {
        console.println("Invalid input! %s is not valid input!", input);
        display();
    }
}
