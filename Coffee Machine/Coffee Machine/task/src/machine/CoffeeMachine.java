package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int hasWater = 400;
    private static int hasMilk = 540;
    private static int hasCoffeeBeans = 120;
    private static int hasDisposableCups = 9;
    private static int hasMoney = 550;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillCoffeeMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Error!");
            }
        }
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu::");
        String numberCoffee = scanner.next();
        switch (numberCoffee) {
            case "1" :
                buyEspresso();
                break;
            case "2" :
                buyLatte();
                break;
            case "3" :
                buyCappuccino();
                break;
            case "back" :
                break;
        }
    }

    public static void buyEspresso() {
        final int WATER_FOR_ESPRESSO = 250;
        final int COFFEE_BEANS_FOR_ESPRESSO = 16;
        final int COST_ESPRESSO = 4;
        if (hasWater >= WATER_FOR_ESPRESSO &&
                hasCoffeeBeans >= COFFEE_BEANS_FOR_ESPRESSO &&
                hasDisposableCups != 0) {
            hasWater -= WATER_FOR_ESPRESSO;
            hasCoffeeBeans -= COFFEE_BEANS_FOR_ESPRESSO;
            hasDisposableCups -= 1;
            hasMoney += COST_ESPRESSO;
            System.out.println("I have enough resources, making you a coffee!");
        } else if(hasWater < WATER_FOR_ESPRESSO) {
            System.out.println("Sorry, not enough water!");
        } else if (hasCoffeeBeans < COFFEE_BEANS_FOR_ESPRESSO) {
            System.out.println("Sorry, not enough coffee beans!");
        } else
            System.out.println("Sorry, not enough disposable cups!");
    }

    public static void buyLatte(){
        final int WATER_FOR_LATTE = 350;
        final int MILK_FOR_LATTE = 75;
        final int COFFEE_BEANS_FOR_LATTE = 20;
        final int COST_LATTE = 7;

        if (hasWater >= WATER_FOR_LATTE &&
                hasMilk >= MILK_FOR_LATTE &&
                hasCoffeeBeans >= COFFEE_BEANS_FOR_LATTE &&
                hasDisposableCups != 0) {
            hasWater -= WATER_FOR_LATTE;
            hasMilk -= MILK_FOR_LATTE;
            hasCoffeeBeans -= COFFEE_BEANS_FOR_LATTE;
            hasDisposableCups -= 1;
            hasMoney += COST_LATTE;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (hasWater < WATER_FOR_LATTE) {
            System.out.println("Sorry, not enough water!");
        } else if (hasMilk < MILK_FOR_LATTE) {
            System.out.println("Sorry, not enough milk!");
        } else if (hasCoffeeBeans < COFFEE_BEANS_FOR_LATTE) {
            System.out.println("Sorry, not enough coffee beans!");
        } else
            System.out.println("Sorry, not enough disposable cups!");
    }

    public static void buyCappuccino() {
        final int WATER_FOR_CAPPUCCINO = 200;
        final int MILK_FOR_CAPPUCCINO = 100;
        final int COFFEE_BEANS_FOR_CAPPUCCINO = 12;
        final int COST_CAPPUCCINO = 6;

        if (hasWater >= WATER_FOR_CAPPUCCINO &&
                hasMilk >= MILK_FOR_CAPPUCCINO &&
                hasCoffeeBeans >= COFFEE_BEANS_FOR_CAPPUCCINO &&
                hasDisposableCups != 0) {
            hasWater -= WATER_FOR_CAPPUCCINO;
            hasMilk -= MILK_FOR_CAPPUCCINO;
            hasCoffeeBeans -= COFFEE_BEANS_FOR_CAPPUCCINO;
            hasDisposableCups -= 1;
            hasMoney += COST_CAPPUCCINO;
            System.out.println("I have enough resources, making you a coffee!");
        }else if (hasWater < WATER_FOR_CAPPUCCINO) {
            System.out.println("Sorry, not enough water!");
        } else if (hasMilk < MILK_FOR_CAPPUCCINO) {
            System.out.println("Sorry, not enough milk!");
        } else if (hasCoffeeBeans < COFFEE_BEANS_FOR_CAPPUCCINO) {
            System.out.println("Sorry, not enough coffee beans!");
        } else
            System.out.println("Sorry, not enough disposable cups!");
    }

    public static void fillCoffeeMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        hasWater += water;
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        hasMilk += milk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeeBeans = scanner.nextInt();
        hasCoffeeBeans += coffeeBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int disposableCups = scanner.nextInt();
        hasDisposableCups += disposableCups;
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + hasMoney + "\n");
        hasMoney -= hasMoney;
    }

    public static void remaining() {
        System.out.println("The coffee machine has:\n" +
                hasWater + " of water\n" +
                hasMilk + " of milk\n" +
                hasCoffeeBeans + " of coffee beans\n" +
                hasDisposableCups + " of disposable cups\n" +
                hasMoney + " of money\n");
    }
}