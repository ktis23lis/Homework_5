package com.company;

public class Dog extends Animal{
    public long count;
    public Dog(String name) {
        super(name);
        count ++;
    }


    protected void dogCounter() {
        if (count == 1) {
            System.out.println("We have " + count + " dog");
        }else System.out.println("We have " + count + " dogs");
    }
}
