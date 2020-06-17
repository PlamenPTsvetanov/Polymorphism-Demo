package zoo.animal;

import zoo.MeatChecker;
import zoo.food.Food;

public class Tiger extends Feline {
    private final String NAME = this.getPluralName();

    public Tiger(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        MeatChecker.checkIfMeat(food, NAME);
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
