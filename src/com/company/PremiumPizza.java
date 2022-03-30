package com.company;

public class PremiumPizza extends Pizza{

    public PremiumPizza(BreadTypes breadType, MeatTypes meatType, Double price) {
        super(breadType, meatType, price);
        addChipsAndDrinks();
    }

    //adding extra Rs.250 for chips & drinks
    private void addChipsAndDrinks(){
        setPrice(getPrice()+additionalItemPrices.get(AdditionalItems.chipsAndDrinks.name()));
    }

    @Override
    void addAdditionalItem() {
        //overriding the add additional items function and removing it because it's not allowed for premium pizza
    }

    @Override
    void showOptions() {
        //removed the add additional items function because additional items are not available for premium pizza
        System.out.println("Select an option\n----------------");
        System.out.println("1. View price");
        System.out.println("2. Finish order");
        System.out.println("Enter your option below");
        String input = scanner.nextLine();

        switch (input){
            case "1":
                viewPrice();
                break;

            case "2":
                finishOrder();
                break;

            default:
                //if the input is invalid then letting the user try again
                System.out.println("Invalid input, try again!");
        }
        showOptions();
    }

    @Override
    void viewPrice() {
        //removed the additional items function
        System.out.println("Base price - Rs.1000.00/-");
        System.out.println("Chips & drinks - Rs."+additionalItemPrices.get(AdditionalItems.chipsAndDrinks.name())+"0/-");
        System.out.println("Grand total - Rs."+getPrice()+"0/-\n");
    }

    //overriding the name with relevant pizza type
    @Override
    void finishOrder() {
        System.out.println("Order summary\n--------------");
        System.out.println("Premium Pizza");
        System.out.println("Meat type - "+ getMeatType().name());
        viewPrice();
        Main.mainMenu();
    }
}
