package com.java.basics;

public class StaticExample {
    static int speed;
    static {
        speed=40;
        System.out.println("Speed from StaticBlock:" + speed);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed:" +speed);
    }
}



