package zoo;

import zoo.food.Food;

// Checking if food is meat
public class MeatChecker {
    public static void checkIfMeat(Food food, String animal) {
        if (food.getClass().getSimpleName().equals("Meat")) {
        } else {
            throw new IllegalArgumentException(animal + " are not eating that type of food!");
        }

    }
}
