package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while(true){
                System.out.println("thread_1:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{
            while(true){
                System.out.println("thread_2:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        t1.start();
        t2.start();
    }
}
