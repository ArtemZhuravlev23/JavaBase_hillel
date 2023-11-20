package home_work_21;

import java.util.List;

public class DrinksMachine {
    public enum Drinks {
        COFFEE("coffee", 30),
        TEA("tea", 20),
        LEMONADE("lemonade", 40),
        MOJITO("mojito", 75),
        WATER("water", 15),
        COKE("coke", 27.50);

        private final String name;
        private final double price;

        Drinks(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " " + price;
        }
    }

    public void printMessage() {
        System.out.println("Please, choose your drink: ");
        Drinks[] drinksChoosen = Drinks.values();
        for (Drinks value : drinksChoosen) {
            System.out.println(value.getName() + " " + value.getPrice() + " UAH");
        }
    }

    public static String makingDrinks(Drinks drink) {
        switch (drink) {
            case COFFEE:
                return "Your " + drink.getName() + " in the process of making...";
            case TEA:
                return "Your " + drink.getName() + " in the process of making...";
            case LEMONADE:
                return "Your " + drink.getName() + " in the process of making...";
            case MOJITO:
                return "Your " + drink.getName() + " in the process of making...";
            case WATER:
                return "Your " + drink.getName() + " issued. Please, take it...";
            case COKE:
                return "Your " + drink.getName() + " issued. Please, take it...";
        }
        throw new IllegalArgumentException("Oops! Unexpected drink. Please, try again.");
    }


    private String calculateTotal(List<Drinks> orderedDrinks) {
        double fullAmount = 0;
        int totalDrinks = orderedDrinks.size();

        for (Drinks drink : orderedDrinks) {
            fullAmount += drink.getPrice();
        }

        return "You've ordered: " + totalDrinks + " drinks." + "\nFull amount to pay: " +
                fullAmount + " UAH." + " Thank you for your order. Bye!";
    }


    public void printTotal(List<Drinks> orderedDrinks) {
        String total = calculateTotal(orderedDrinks);
        System.out.println(total);
    }

}
