package zoo.animal;

public class Cat extends Feline {
    private String breed;

    public Cat(String name, String type, Double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        return this.getType() + "["
                + this.getName() + ", " + this.breed + ", " + this.removeLeadingZeros(this.getWeight())
                + ", " + this.getLivingRegion()
                + ", " + this.removeLeadingZeros(this.getFoodEaten()) + "]";
    }
}
