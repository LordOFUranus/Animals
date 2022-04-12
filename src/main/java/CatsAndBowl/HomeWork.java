package CatsAndBowl;

public class HomeWork {
    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        bowl.putFood(100);
        System.out.println();
        Cats[] cats = new Cats[5];
        cats[0] = new Cats ("Chernysh",5);
        cats[1] = new Cats ("Vasya",15);
        cats[2] = new Cats("Ryzhik", 22);
        cats[3] = new Cats("Matilda", 40);
        cats[4] = new Cats("Pushok", 39);

        for (int i = 0; i<cats.length; i++) {
            cats[i].eat(bowl);
            System.out.println("В миске "+ bowl.getFoodAmount()+" еды.");
            System.out.println();
        }
    }
}
