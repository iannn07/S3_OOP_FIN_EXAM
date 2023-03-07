/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pristianbudidharmawan_2501983105_lb20_oop_finalexam;

import java.util.Scanner;

/**
 *
 * @author Iannn
 */
public class start{
    public static void cls(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public static void newLine(){
        Scanner ent = new Scanner(System.in);
        System.out.print("\nPress ENTER to continue...");
        ent.nextLine();
    }
    public static void menu(){
        System.out.println("\t\t\t\tMade by\n\t\t\t\tPristian Budi Dharmawan - 2501983105\n");
        System.out.println("1. Package A (Hotdog + Fries + Drink)");
        System.out.println("2. Package B (Burger + Fries + Drink)");
        System.out.println("3. Package C (Chicks + Fries + Drink)");
        System.out.println("0. EXIT");
        System.out.print("INPUT: ");
    }
    public static void main(String[] args) throws Exception{
        Scanner choice = new Scanner(System.in);
        int opt, pkg;
        
        pA packageA = new pA();
        pB packageB = new pB();
        pC packageC = new pC();

        do{
            cls();
            menu();
            opt = choice.nextInt();
            switch(opt){
                case 1:
                    System.out.print("How many package: "); 
                    pkg = choice.nextInt();
                    packageA.cook(true, pkg);
                    packageA.cook(false, pkg);
                    newLine();
                    break;
                case 2:
                    System.out.print("How many package: "); 
                    pkg = choice.nextInt();
                    packageB.cook(true, pkg);
                    packageB.cook(false, pkg);
                    newLine();
                    break;
                case 3:
                    System.out.print("How many package: "); 
                    pkg = choice.nextInt();
                    packageC.cook(true, pkg);
                    packageC.cook(false, pkg);
                    newLine();
                    break;
            }
        } while(opt != 0);
        
        cls();
        System.out.println("Thankyou");
        newLine();
    
    } 
}
