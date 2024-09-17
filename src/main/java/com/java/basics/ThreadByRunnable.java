package com.java.basics;

public class ThreadByRunnable implements Runnable{
  public  void run (){
    for(int i=0; i<10; i++){
        System.out.println(i+" "+Thread.currentThread().getName());
    }
    }

  public static void main(String [] args) {
      Thread t1 = new Thread(new ThreadByRunnable());
      Thread t2 = new Thread(new ThreadByRunnable());
      t1.start();
      t2.start();
  }

}