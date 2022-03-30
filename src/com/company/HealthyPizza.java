package com.company;

public class HealthyPizza extends Pizza{


    public HealthyPizza(BreadTypes breadType, MeatTypes meatType, Double price) {
        super(breadType, meatType, price);
    }

    @Override
    void addAdditionalItem() {
        //printing available addition options
        System.out.println("Please select an option.");
        System.out.println("1.Lettuce");
        System.out.println("2.Tomato");
        System.out.println("3.Carrot");
        System.out.println("4.Onion");
        System.out.println("5.Bell pepper");
        System.out.println("6.Mushroom");
        System.out.println("7.Cancel");

        //reading user input
        String input = scanner.nextLine();

        //adding the relevant additional item according to the user input
        switch (input){
            case "1":
                if (!getSelectedAdditionalItems().contains(AdditionalItems.lettuce)){
                    getSelectedAdditionalItems().add(AdditionalItems.lettuce);
                    setPrice(getPrice() + additionalItemPrices.get(AdditionalItems.lettuce.name()));
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
                if (!getSelectedAdditionalItems().contains(AdditionalItems.tomato)){
                    getSelectedAdditionalItems().add(AdditionalItems.tomato);
                    setPrice(getPrice() + additionalItemPrices.get(AdditionalItems.tomato.name()));
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
                if (!getSelectedAdditionalItems().contains(AdditionalItems.carrot)){
                    getSelectedAdditionalItems().add(AdditionalItems.carrot);
                    setPrice(getPrice() + additionalItemPrices.get(AdditionalItems.carrot.name()));
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
                if (!getSelectedAdditionalItems().contains(AdditionalItems.onion)){
                    getSelectedAdditionalItems().add(AdditionalItems.onion);
                    setPrice(getPrice() + additionalItemPrices.get(AdditionalItems.onion.name()));
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
                if (!getSelectedAdditionalItems().contains(AdditionalItems.bellPepper)){
                    getSelectedAdditionalItems().add(AdditionalItems.bellPepper);
                    setPrice(getPrice() + additionalItemPrices.get(AdditionalItems.bellPepper.name()));
                    System.out.println("Item successfully added!");
                    repeatAdding();
                }
                else {
                    //if the item is already added then showing a message to the user
                    System.out.println("You have already added bell pepper, please try another item!");
                    addAdditionalItem();
                }
                break;

            case "6":
                if (!getSelectedAdditionalItems().contains(AdditionalItems.mushroom)){
                    getSelectedAdditionalItems().add(AdditionalItems.mushroom);
                    setPrice( getPrice() + additionalItemPrices.get(AdditionalItems.mushroom.name()));
                    System.out.println("Item successfully added!");
                    repeatAdding();
                }
                else {
                    //if the item is already added then showing a message to the user
                    System.out.println("You have already added mushroom, please try another item!");
                    addAdditionalItem();
                }
                break;

            case "7":
                //cancel
                break;

            default:
                //if the input is invalid then letting the user try again
                System.out.println("Invalid input! Please enter the number of your choice");
                addAdditionalItem();
        }
    }

    //overriding the name with relevant pizza type
    @Override
    void finishOrder() {
        System.out.println("Order summary\n--------------");
        System.out.println("Healthy Pizza (Kurakkan Bread)");
        System.out.println("Meat type - "+ getMeatType().name());
        viewPrice();
        Main.mainMenu();
    }
}
