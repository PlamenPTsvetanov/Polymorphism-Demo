package zoo;

import zoo.food.Food;

// check if food is vegetable
public class VegetableChecker {
    public static void checkIfVegetable(Food food, String animal) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
        } else {
            throw new IllegalArgumentException(animal + " are not eating that type of food!");
        }

    }
}
