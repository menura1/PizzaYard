package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Pizza extends PizzaInfo{

    //holds the price of the pizza
    private Double price;
    //holds the type of the bread
    private BreadTypes breadType;
    //holds the type of the bread
    private MeatTypes meatType;
    //holds additional items selected by the user
    private ArrayList<AdditionalItems> selectedAdditionalItems = new ArrayList<>();

    //getters and setters
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MeatTypes getMeatType() {
        return meatType;
    }

    public ArrayList<AdditionalItems> getSelectedAdditionalItems() {
        return selectedAdditionalItems;
    }

    // Creating a Scanner object
    Scanner scanner = new Scanner(System.in);

    //constructor
    public Pizza(BreadTypes breadType, MeatTypes meatType, Double price) {
        this.price = price;
        this.breadType = breadType;
        this.meatType = meatType;
    }

    void addAdditionalItem(){
        //printing available addition options
        System.out.println("Please select an option.");
        System.out.println("1.Lettuce");
        System.out.println("2.Tomato");
        System.out.println("3.Carrot");
        System.out.println("4.Onion");
        System.out.println("5.Cancel");

        //reading user input
        String input = scanner.nextLine();

        //adding the relevant additional item according to the user input
        switch (input){
            case "1":
                if (!selectedAdditionalItems.contains(AdditionalItems.lettuce)){
                    selectedAdditionalItems.add(AdditionalItems.lettuce);
                    price += additionalItemPrices.get(AdditionalItems.lettuce.name());
                    System.out.println("Item successfully added!");
                    repeatAdding();
                }
                else {
                    //if the item is already added then showing a message to the user
                    System.out.println("You have already added lettuce, please try another item!");
                    addAdditionalItem();
                }
                break;

            case "2":
                if (!selectedAdditionalItems.contains(AdditionalItems.tomato)){
                    selectedAdditionalItems.add(AdditionalItems.tomato);
                    price += additionalItemPrices.get(AdditionalItems.tomato.name());
                    System.out.println("Item successfully added!");
                    repeatAdding();
                }
                else {
                    //if the item is already added then showing a message to the user
                    System.out.println("You have already added tomato, please try another item!");
                    addAdditionalItem();
                }
                break;

            case "3":
                if (!selectedAdditionalItems.contains(AdditionalItems.carrot)){
                    selectedAdditionalItems.add(AdditionalItems.carrot);
                    price += additionalItemPrices.get(AdditionalItems.carrot.name());
                    System.out.println("Item successfully added!");
                    repeatAdding();
                }
                else {
                    //if the item is already added then showing a message to the user
                    System.out.println("You have already added carrot, please try another item!");
                    addAdditionalItem();
                }
                break;

            case "4":
                if (!selectedAdditionalItems.contains(AdditionalItems.onion)){
                    selectedAdditionalItems.add(AdditionalItems.onion);
                    price += additionalItemPrices.get(AdditionalItems.onion.name());
                    System.out.println("Item successfully added!");
                    repeatAdding();
                }
                else {
                    //if the item is already added then showing a message to the user
                    System.out.println("You have already added onion, please try another item!");
                    addAdditionalItem();
                }
                break;

            case "5":
                //cancel
                break;

            default:
                //if the input is invalid then letting the user try again
                System.out.println("Invalid input! Please enter the number of your choice");
                addAdditionalItem();
        }
    }

    //viewing all price data
    void viewPrice(){
        System.out.println("Base price - Rs.1000.00/-");
        if (selectedAdditionalItems.size()>0){
            System.out.println("Added additional items");
            for (int i=0; i< selectedAdditionalItems.size(); i++){
                System.out.println(selectedAdditionalItems.get(i)+" - "+additionalItemPrices.get(selectedAdditionalItems.get(i).name()).toString()+"0/-");
            }
        }
        System.out.println("Grand total - Rs."+price+"0/-\n");
    }

    //repeating the adding items functionality
    void repeatAdding(){
        System.out.println("Do yo want to add another additional item? (Y/N)");
        String input = scanner.nextLine();

        switch (input.toLowerCase()){
            case "y":
                addAdditionalItem();
                break;

            case "n":
                break;

            default:
                System.out.println("Invalid input!");
                repeatAdding();
        }
    }

    //showing available options for the chosen pizza
    void showOptions(){
        //getting user input
        System.out.println("Select an option\n----------------");
        System.out.println("1. View price");
        System.out.println("2. Add additional items");
        System.out.println("3. Finish order");
        System.out.println("Enter your option below");
        String input = scanner.nextLine();

        switch (input){
            case "1":
                viewPrice();
                break;

            case "2":
                addAdditionalItem();
                break;

            case "3":
                finishOrder();
                break;

            default:
                System.out.println("Invalid input!");
                showOptions();
        }
        showOptions();


    }

    //finishing and completing the order
    void finishOrder(){
        System.out.println("Order summary\n--------------");
        System.out.println("Basic Pizza");
        System.out.println("Meat type - "+ meatType.name());
        viewPrice();
        Main.mainMenu();
    }

}
