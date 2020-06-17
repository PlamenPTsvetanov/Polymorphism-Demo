package zoo.animal;

import zoo.food.Food;

import java.text.DecimalFormat;

public abstract class AnimalImpl implements Animal {
    private String name;
    private String type;
    private Double weight;
    private String livingRegion;
    private Double foodEaten;


    public AnimalImpl(String name, String type, Double weight, String livingRegion) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.livingRegion = livingRegion;
        this.foodEaten = 0d;
    }

    public String getPluralName() {
        return this.getClass().getSimpleName() + "s";
    }

    // Remove leading zeros from decimal
    public String removeLeadingZeros(Double input) {
        DecimalFormat dc = new DecimalFormat("#.##");

        return dc.format(input);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getWeight() {
        return weight;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public Double getFoodEaten() {
        return foodEaten;
    }

    @Override
    public String toString() {
        return this.type + "["
                + this.name + ", " + this.removeLeadingZeros(weight)
                + ", " + this.livingRegion
                + ", " + this.removeLeadingZeros(foodEaten) + "]";
    }
}
