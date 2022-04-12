package org.example.Animals;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        dogScore++;
    }

    @Override
    public void create() {
        System.out.println("Создана собака "+ name);
    }

    @Override
    public void run(int runLength){
        distantRunLimit = 500;
        if(runLength<=distantRunLimit){
            System.out.printf("Собака %s пробежала %s метров\n",name, runLength);
        }
        else System.out.printf("Собака не может пробежать более %s метров!\n",distantRunLimit);
    }

    public void swim(int swimLength) {
        distantSwimLimit = 10;
        if(swimLength<=distantSwimLimit){
            System.out.printf("Собака %s проплыла %s метров\n",name, swimLength);
        }
        else System.out.printf("Собака не может проплыть более %s метров!\n",distantSwimLimit);
    }

    public void getDogScore(){
        System.out.printf("%s собак было создано\n",dogScore);
    }
}
