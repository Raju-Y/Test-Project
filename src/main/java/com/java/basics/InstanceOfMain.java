package com.java.basics;

class Animal {

    }

     class Dog extends Animal {

    }
    class Cat extends Animal{

    }
    public class InstanceOfMain {
        public static void main(String[] args) {
            Animal a1 = new Dog();
            Animal b1 = new Cat();
            System.out.println(a1 instanceof Dog);
            System.out.println(a1 instanceof Animal);
            System.out.println(b1 instanceof Cat);
        }
    }


