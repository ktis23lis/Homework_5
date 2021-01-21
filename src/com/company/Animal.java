package com.company;

public  class Animal {
    protected String name;
    protected int distanceRun = 0;
    protected int distanceSwim = 0;
    static long count;

    protected Animal(String name) {
        this.name = name;
        count ++;
    }


    protected void run ( int a){
        distanceRun += a;
        if (distanceRun <= 500) {
            System.out.println(name + " " + distanceRun + " m ran");
        }else System.out.println(name + " max distance run 500");
    }

    protected void swim(int a){
        distanceSwim += a;
        if (distanceSwim <= 10) {
            System.out.println(name + " " + distanceSwim + " m swam");
        }else System.out.println(name + "max distance swim 10");
    }

    protected void animalCounter() {
        if (count == 1) {
            System.out.println("We have " + count + " animal");
        }else System.out.println("We have " + count + " animals");
    }
}
