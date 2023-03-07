package com.mycompany.pristianbudidharmawan_2501983105_lb20_oop_finalexam;

public class pA extends packageHandler{
    public void cook(boolean trusted, int total) throws InterruptedException{
        long stopWatch;

        //MultiThreading
        if(trusted){
            System.out.println("\nMultithread");
            stopWatch = System.currentTimeMillis();
            for(int i = 0; i < total; i++){
                Thread hd = new Thread(new hotdogs(i));
                Thread fries = new Thread(new fries(i));
                Thread drink = new Thread(new drink(i));
                System.out.println("Package #" + (i+1));
                System.out.println("--------------");
                hd.start();
                fries.start();
                drink.start();

                hd.join();
                fries.join();
                drink.join();
                System.out.println("--------------\n");
            }
                            
            System.out.println("Completed in " + (System.currentTimeMillis() - stopWatch));
            System.out.println("======================================");
        }
        
        //Without MultiThreading
        else{
            System.out.println("Non-MT");
            stopWatch = System.currentTimeMillis();
            
            for(int i=0; i < total; i++){
                Thread hd = new Thread(new hotdogs(i));
                Thread fries = new Thread(new fries(i));
                Thread drink = new Thread(new drink(i));
                System.out.println("\nPackage #" + (i+1));
                System.out.println("--------------");
                hd.start();
                hd.join();
                
                fries.start();
                fries.join();
                
                drink.start();                            
                drink.join();
                System.out.println("--------------\n");
            }

            System.out.println("Completed in " + (System.currentTimeMillis() - stopWatch));
        }
    }
}
