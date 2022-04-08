package org.example.Animals;

public abstract class Animal {
    protected int distantRunLimit;
    protected int distantSwimLimit;
    protected String name;
    protected static int animalScore = 0;
    protected static int catScore = 0;
    protected static int dogScore = 0;

    Animal(String name){
        this.name = name;
        create();
        animalScore++;
    }
    protected void create(){
        System.out.println("Создано животное "+ name);
    }
    protected abstract void run(int runLength);

    public void getAnimalScore(){
        System.out.printf("%s животных было создано в общем\n",animalScore);
    }

    protected abstract void swim(int swimLength);

}
