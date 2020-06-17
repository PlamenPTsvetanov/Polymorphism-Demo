package zoo.food;

public abstract class Food {
    private Integer quantity;

    public Food(Integer quality) {
        this.quantity = quality;
    }


    public Integer getQuantity() {
        return quantity;
    }
}
