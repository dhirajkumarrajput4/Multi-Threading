package com.threads.threading;

public class ConsumerThread extends Thread {

    private Company company;

    public ConsumerThread(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                this.company.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}
