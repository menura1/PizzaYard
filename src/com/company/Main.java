package com.company;
import java.util.Scanner;

public class Main extends PizzaInfo {

    // Creating a Scanner object
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }


    //creates a basic pizza object
    private static void basePizza() {
        MeatTypes meatType = getMeatType();
        System.out.println("Successfully added "+ meatType.name()+".");
        Pizza pizza = new Pizza(BreadTypes.normal, meatType, 1000.00);
        pizza.showOptions();
    }

    //creates a basic healthy object
    private static void healthyPizza() {
        MeatTypes meatType = getMeatType();
        System.out.println("Successfully added "+ meatType.name()+".");
        HealthyPizza pizza = new HealthyPizza(BreadTypes.kurakkan, meatType, 1000.00);
        pizza.showOptions();
    }

    //creates a basic premium object
    private static void premiumPizza() {
        MeatTypes meatType = getMeatType();
        System.out.println("Successfully added "+ meatType.name()+".");
        PremiumPizza pizza = new PremiumPizza(BreadTypes.normal, meatType, 1000.00);
        pizza.showOptions();
    }

    //displays the main menu
    static void mainMenu() {
        System.out.println("Create a new pizza.\n------------------");
        System.out.println("Select a pizza type.");
        System.out.println("1. Base Pizza");
        System.out.println("2. Healthy Pizza");
        System.out.println("3. Premium Pizza");
        System.out.println("4. Exit program\n");
        System.out.println("Enter the option number below.");

        //reading user input
        String input = scanner.nextLine();

        //creating the pizza object according to the user input
        switch (input) {
            case "1":
                System.out.println("Basic Pizza");
                basePizza();
                break;

            case "2":
                System.out.println("Healthy Pizza (Kurakkan Bread)");
                healthyPizza();
                break;

            case "3":
                System.out.println("Premium Pizza (Comes with chips & drinks)");
                premiumPizza();
                break;

            case "4":
                System.out.println("Goodbye!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid input. Please try again!");

        }
        mainMenu();

    }

    //reading user input and getting preferred meat type
    private static MeatTypes getMeatType() {

        MeatTypes meatType;

        //reading user input
        System.out.println("Select meat type.");
        System.out.println("1. " + MeatTypes.chicken.name());
        System.out.println("2. " + MeatTypes.fish.name());
        System.out.println("3. " + MeatTypes.beef.name());
        System.out.println("4. " + MeatTypes.pork.name());
        System.out.println("5. " + MeatTypes.noMeat.name());
        System.out.println("Enter the option number below.");

        String input = scanner.nextLine();

        //adding the relevant meat type according to the user input
        switch (input) {
            case "1":
                meatType = MeatTypes.chicken;
                break;

            case "2":
                meatType = MeatTypes.fish;
                break;

            case "3":
                meatType = MeatTypes.beef;
                break;

            case "4":
                meatType = MeatTypes.pork;
                break;

            case "5":
                meatType = MeatTypes.noMeat;
                break;

            default:
                System.out.println("Invalid input. Please try again!");
                meatType = getMeatType();

        }
        return meatType;
    }

}
