package org.example.Animals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
        catScore++;
    }

    @Override
    public void create() {
        System.out.println("Создана кошка "+ name);
    }

    @Override
    public void run(int runLength) {
        distantRunLimit = 200;
        if(runLength<=distantRunLimit){
            System.out.printf("Кошка %s пробежала %s метров\n",name, runLength);
        }
        else System.out.printf("Кошка не может пробежать более %s метров!\n",distantRunLimit);
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Кошки не плавают!");
    }
    public void getCatScoretScore(){
        System.out.printf("%s котов было создано\n",catScore);
    }
}
