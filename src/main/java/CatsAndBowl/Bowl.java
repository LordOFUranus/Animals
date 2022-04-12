package CatsAndBowl;

public class Bowl {
    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Добавлено в миску %d еды. В миске сейчас %d столько еды\n", amount, foodAmount);
    }
    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
    }
    public int getFoodAmount() {
        return foodAmount;
    }
}
