package com.github.curriculeon.casino.profile;

public class Profile implements ProfileInterface {
    private final Long profileId;
    private final String name;
    private Double balance;

    public Profile(String name, Double balance, Long profileId) {
        this.name = name;
        this.balance = balance;
        this.profileId = profileId;
    }


    @Override
    public void setBalance(Double newBalance) {
        this.balance = balance;
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
