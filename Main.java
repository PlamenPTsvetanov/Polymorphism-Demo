import zoo.animal.Cat;
import zoo.animal.Mouse;
import zoo.animal.Tiger;
import zoo.animal.Zebra;
import zoo.food.Food;
import zoo.food.Meat;
import zoo.food.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up
        Scanner scanner = new Scanner(System.in);

        //Getting animal data
        String animalInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        // Begin of cycle
        while (!animalInput.equals("End")) {

            //Getting data for food and dividing it into pieces
            String foodInput = scanner.nextLine();
            String[] animalTokens = animalInput.split("\\s+");
            String[] foodTokens = foodInput.split("\\s+");

            // Setting animal data
            String animalType = animalTokens[0];
            String animalName = animalTokens[1];
            Double animalWeight = Double.parseDouble(animalTokens[2]);
            String animalHome = animalTokens[3];
            String catBreed = null;

            // Checking if animal is cat
            if (animalType.equals("Cat")) {
                catBreed = animalTokens[4];
            }

            // Setting up food
            String foodType = foodTokens[0];
            Integer foodQuantity = Integer.parseInt(foodTokens[1]);

            Food food = null;

            // Creating food
            switch (foodType) {
                case "Meat": {
                    food = new Meat(foodQuantity);
                    break;
                }
                case "Vegetable":
                    food = new Vegetable(foodQuantity);
                    break;
            }
            if (food == null) {
                System.out.println("Invalid input");
                continue;
            }
            // Creating animal
            switch (animalType) {
                case "Cat": {
                    Cat cat = new Cat(animalName, animalType, animalWeight, animalHome, catBreed);
                    cat.makeSound();
                    try {
                        cat.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    sb.append(cat.toString()).append(System.lineSeparator());
                    break;
                }

                case "Tiger": {
                    Tiger tiger = new Tiger(animalName, animalType, animalWeight, animalHome);
                    tiger.makeSound();
                    try {
                        tiger.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    sb.append(tiger.toString()).append(System.lineSeparator());
                    break;
                }

                case "Zebra": {
                    Zebra zebra = new Zebra(animalName, animalType, animalWeight, animalHome);
                    zebra.makeSound();
                    try {
                        zebra.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    sb.append(zebra.toString()).append(System.lineSeparator());
                    break;
                }

                case "Mouse": {
                    Mouse mouse = new Mouse(animalName, animalType, animalWeight, animalHome);
                    mouse.makeSound();
                    try {
                        mouse.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    sb.append(mouse.toString()).append(System.lineSeparator());
                    break;
                }
            }

            animalInput = scanner.nextLine();

        }
        System.out.println(sb.toString().trim());
    }
}
