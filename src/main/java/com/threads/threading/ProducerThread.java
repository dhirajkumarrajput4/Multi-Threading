package com.threads.threading;

public class ProducerThread extends Thread{

    private Company company;

    public ProducerThread(Company company){
        this.company = company;
    }


    @Override
    public void run() {
        int i=1;
        while(true)
        {
            try {
                this.company.produce_item(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}
