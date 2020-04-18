package machine;

import java.util.Scanner;

public class Action {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void buyCoffee() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        System.out.print("> ");
        Scanner ch = new Scanner(System.in);
        String coffee = ch.next();
        switch(coffee) {
            case "1":
                if (water < 250) System.out.println("Sorry, not enough water!");
                else if (beans < 16) System.out.println("Sorry, not enough coffee beans!");
                else if (cups < 1) System.out.println("Sorry, not enough cups!");
                else {
                    water = water - 250;
                    beans = beans - 16;
                    money = money + 4;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (water < 350) System.out.println("Sorry, not enough water!");
                else if (milk < 75) System.out.println("Sorry, not enough milk!");
                else if (beans < 20) System.out.println("Sorry, not enough coffee beans!");
                else if (cups < 1) System.out.println("Sorry, not enough cups!");
                else {
                    water = water - 350;
                    milk = milk - 75;
                    beans = beans - 20;
                    money = money + 7;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (water < 200) System.out.println("Sorry, not enough water!");
                else if (milk < 100) System.out.println("Sorry, not enough milk!");
                else if (beans < 12) System.out.println("Sorry, not enough coffee beans!");
                else if (cups < 1) System.out.println("Sorry, not enough cups!");
                else {
                    water = water - 200;
                    milk = milk - 100;
                    beans = beans - 12;
                    money = money + 6;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                process();
        }
        System.out.println();
    }

    public static void fillMachine() {
        System.out.println();
        Scanner add = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add: ");
        System.out.print("> ");
        int fillWater = add.nextInt();
        water += fillWater;

        System.out.println("Write how many ml of milk do you want to add: ");
        System.out.print("> ");
        int fillMilk = add.nextInt();
        milk += fillMilk;

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        System.out.print("> ");
        int fillBeans = add.nextInt();
        beans += fillBeans;

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        System.out.print("> ");
        int fillCups = add.nextInt();
        cups += fillCups;

        System.out.println();
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

    public static void remainingInMachine() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }

    public static boolean process() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        System.out.print("> ");
        String choice = in.next();
        switch(choice) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillMachine();
                break;
            case "take":
                takeMoney();
                break;
            case "remaining":
                remainingInMachine();
                break;

            case "exit":
                return false;
        }
        return true;
    }
}
