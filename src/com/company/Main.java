package com.company;

public class Main {

    public static void main(String[] args) {
        Cat c = new Cat("Vasiya");
        c.run(20);
        c.run(200);
        System.out.println(Animal.count);
        c.swim(10);

        Cat c2 = new Cat("Pusia");
        c2.run(12);
        c2.animalCounter();
        c2.catCounter();

        Dog d = new Dog("Bobik");
        d.run(333);
        d.swim(3);
        d.animalCounter();
        d.dogCounter();





    }
}
