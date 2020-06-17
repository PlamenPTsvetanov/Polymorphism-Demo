package zoo.animal;

public abstract class Mammal extends AnimalImpl {
    private String livingRegion;

    public Mammal(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
        this.livingRegion = livingRegion;
    }
}
