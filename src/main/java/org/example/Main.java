package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();

        long expected = 1000;
        long actual = bonusService.calculate(10000, true);

        System.out.println("Registered User, expected " + expected + " actual " + actual);
    }
}