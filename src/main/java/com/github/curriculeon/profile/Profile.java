package com.github.curriculeon.profile;


import com.github.curriculeon.utils.InputOutputConsole;

public class Profile implements ProfileInterface {
    InputOutputConsole console = new InputOutputConsole();
    private final Long profileId;
    private final String name;
    private Double balance;

    public Profile(String name, Double balance, Long profileId) {
        this.name = name;
        this.balance = balance;
        this.profileId = profileId;
    }

    @Override
    public void printInformation() {
        console.println("Printing profile details");
        console.println("\tName:\t\t %s", getName());
        console.println("\tBalance:\t %s", getBalance());
        console.println("\tId:\t\t\t %s", getProfileId());
    }

    @Override
    public void increaseBalance(double amount) {
        double oldBalance = getBalance();
        double newBalance = oldBalance + amount;
        String deltaStr = newBalance > oldBalance ? "increased" : "decreased";

        setBalance(newBalance);
        console.println("[ %s ]'s balance has %s from [ %s ] to [ %s ]", name, deltaStr, oldBalance, newBalance);
    }

    @Override
    public void decreaseBalance(double amount) {
        increaseBalance(amount * -1);
    }

    @Override
    public Double createBetAmount() {
        double playerBalance = getBalance();
        double playerBet = console.getLongInput("How much money would you like to bet this game, [ %s ] ?", getName());
        if (playerBet <= playerBalance) {
            return playerBet;
        } else {
            console.println("You cannot bet more money than what is credited to your player-profile.");
            console.println("Try inputting a valid less than [ %s ]", playerBalance);
            printInformation();
            return createBetAmount();
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Long getProfileId() {
        return this.profileId;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
}
