package com.company;

import java.util.Map;

public class PizzaInfo {

    //used enums for better scalability & code maintenance

    //this enum contains the additional items
    enum AdditionalItems{
        lettuce,
        tomato,
        carrot,
        onion,
        bellPepper,
        mushroom,
        chipsAndDrinks
    }

    //this map holds the prices of additional items
    static Map<String, Double> additionalItemPrices = Map.of(
            AdditionalItems.lettuce.name() , 100.00,
            AdditionalItems.tomato.name(),110.00,
            AdditionalItems.carrot.name(), 120.00,
            AdditionalItems.onion.name(), 130.00,
            AdditionalItems.bellPepper.name(), 140.00,
            AdditionalItems.mushroom.name(), 150.00,
            AdditionalItems.chipsAndDrinks.name(), 250.00
    );

    //this enum contains types of bread
    enum BreadTypes{
        normal,
        kurakkan
    }

    //this enum contains types of meat
    enum MeatTypes{
        chicken,
        fish,
        beef,
        pork,
        noMeat
    }

}
