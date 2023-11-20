package home_work_21;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DrinksMachineRunner {
    public static void main(String[] args) {
        DrinksMachine drinksMachine = new DrinksMachine();

        drinksMachine.printMessage();

        Scanner scanner = new Scanner(System.in);
        List<DrinksMachine.Drinks> orderedDrinks = new ArrayList<>();

        while (true) {
            System.out.println("Enter name of drink or choose button 'exit' to finish: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                DrinksMachine.Drinks selectedDrink = DrinksMachine.Drinks.valueOf(userChoice.toUpperCase());
                System.out.println(DrinksMachine.makingDrinks(selectedDrink));
                orderedDrinks.add(selectedDrink);
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect choice. Please, try again.");
            }
        }
        drinksMachine.printTotal(orderedDrinks);
    }

}