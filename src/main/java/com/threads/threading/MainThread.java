package com.threads.threading;

public class MainThread {

    public static void main(String[] args){
        Company comp=new Company();
        ProducerThread p=new ProducerThread(comp);
        ConsumerThread c=new ConsumerThread(comp);
//    Thread t1 = new Thread(p);
//    Thread t2 = new Thread(c);
        p.start();
        c.start();
    }



}
