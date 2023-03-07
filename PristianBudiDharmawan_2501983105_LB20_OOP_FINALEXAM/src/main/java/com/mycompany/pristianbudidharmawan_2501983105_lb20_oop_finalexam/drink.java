package com.mycompany.pristianbudidharmawan_2501983105_lb20_oop_finalexam;

import java.util.concurrent.ThreadLocalRandom;

public class drink implements Runnable{
    private int qty;

    public drink(int qty){
        this.qty = qty;
    }
    @Override
    public void run(){
        int randomNum = ThreadLocalRandom.current().nextInt(100, 5000 + 1);
        try {
            Thread.sleep(randomNum);
            System.out.println("Drink Completed");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
