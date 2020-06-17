package zoo.animal;

import zoo.food.Food;

// Animal interface
public interface Animal {
    String getPluralName();

    void makeSound();

    void eat(Food food);
}
