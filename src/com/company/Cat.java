package com.company;

public class Cat extends Animal{
    static long count;


    public Cat(String name) {
        super(name);
        count ++;
    }

    @Override
    protected void run ( int a){
        distanceRun += a;
        if (distanceRun <= 200) {
            System.out.println(name + " " + distanceRun + " m ran");
        }else System.out.println(name + " max distance run 200");
    }

    @Override
    protected void swim(int a){
        System.out.println("WOW, easy! " + name + " it's cat! It can't swim!");

    }


    protected void catCounter() {
        if (count == 1) {
            System.out.println("We have " + count + " cat");
        }else System.out.println("We have " + count + " cats");
    }
}
