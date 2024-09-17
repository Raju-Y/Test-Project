package com.java.basics;

public class Number {
    int count=0;
  public synchronized   void increment() {
        count++;
    }
    int getCount() {
        return count;
    }
}
class multithreading {
    public static void main(String [] args) throws InterruptedException {
        Number n1=new Number();
        Thread t1 = new Thread( ()->{
            for(int i=0; i<10000000; i++){
                n1.increment();
            }
        }
        );
    Thread t2 = new Thread( ()->{
        for(int i=0; i<10000000; i++) {
            n1.increment();
        }
    }
        );
    t1.start();
    t2.start();
       t1.join();
       t2.join();
        System.out.println(n1.getCount());

    }
}
