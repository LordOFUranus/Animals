package CatsAndBowl;

public class Cats {
    private String name;
    private int hunger;
    private boolean hungerStatus;

    public Cats(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        hungerStatus = false;
    }

    public void eat(Bowl bowl) {
        if(bowl.getFoodAmount()>0){
            if(bowl.getFoodAmount()>=hunger/2){
                if(bowl.getFoodAmount()>=hunger){
                    bowl.decreaseFood(hunger);
                    System.out.printf("Кот %s съел %d единиц еды\n", name, hunger);
                }
                else{
                    hunger-= bowl.getFoodAmount();
                    System.out.printf("Кот %s съел %d остаток количества еды и " +
                                    "кот еще хочет есть %d единиц еды\n",
                            name, bowl.getFoodAmount(),hunger);
                    bowl.decreaseFood(bowl.getFoodAmount());
                }
                hungerStatus = true;
                System.out.printf("Кот %s поел-сыт\n", name);
            }
            else System.out.printf("Кот %s не съест порцию меньшую половины его потребности\n", name);

        }
        else System.out.println("В миске нет еды");

    }

    public int getHunger(){
        return hunger;
    }
    public boolean isHungerStatus(){
        return hungerStatus;
    }
}
