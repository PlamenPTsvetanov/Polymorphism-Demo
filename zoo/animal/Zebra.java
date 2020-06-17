package zoo.animal;

import zoo.VegetableChecker;
import zoo.food.Food;

public class Zebra extends Mammal {
    private final String NAME = this.getPluralName();

    public Zebra(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        VegetableChecker.checkIfVegetable(food, NAME);
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
