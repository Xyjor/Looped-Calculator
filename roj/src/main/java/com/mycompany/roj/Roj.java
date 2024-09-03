/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roj;

import java.util.Scanner;

/**
 *
 * @author eve
 */
public class Roj {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int a, b, c, d, e;
        String Transac, choice;
        int Choice, Apple = 0, Bag = 0, Cabbage = 0, Donut = 0, Eggs = 0;
        
        
        do {System.out.println("Welcome to \"Ambet's Store\"");
            System.out.println("""
                               ITEM LISTS
                               Apple    Price: 2.5$
                               Bag      Price: 50$
                               Cabbage  Price: 1.7$
                               Donut    Price: 5$
                               Eggs     Price: 0.3$ """);
            System.out.println("Do you want to purchase an item?\ny/n");
            
            
            double Applet  = 0;
            double Bagt = 0;
            double Cabbaget = 0;
            double Donutt = 0;
            double Eggst = 0;
            String confirm = i.next();
            
            while (confirm.equals("y")) {
                System.out.println("""
                                   "Choose one Item from the list provided below:"
                                   1 --- Apple
                                   2 --- Bag
                                   3 --- Cabbage
                                   4 --- Donut
                                   5 --- Eggs """);
                
                Applet      = Apple*2.5; 
                Bagt        = Bag*50 ;
                Cabbaget    = Cabbage*1.7 ;
                Donutt      = Donut*5 ;
                Eggst       = Eggs*0.3 ;
               
                
                Choice = i.nextInt();
                if(Choice == 1) {
                    System.out.println("Quantity: ");
                    Apple = i.nextInt();
                        System.out.println(Apple*2.5 + Applet + Bagt + Cabbaget + Donutt + Eggst);}
                
                
                else if(Choice == 2) {
                    System.out.println("Quantity: ");
                    Bag = i.nextInt();
                        System.out.println(Bag*50 + Applet + Bagt + Cabbaget + Donutt + Eggst);}
                
                
                else if(Choice == 3) {
                    System.out.println("Quantity: ");
                    Cabbage = i.nextInt();
                        System.out.println(Cabbage*1.7 + Applet + Bagt + Cabbaget + Donutt + Eggst);}
                
                
                else if(Choice == 4) {
                    System.out.println("Quantity: ");
                    Donut = i.nextInt();
                        System.out.println(Donut*5 + Applet + Bagt + Cabbaget + Donutt + Eggst);}
                
                
                else if(Choice == 5) {
                    System.out.println("Quantity: ");
                    Eggs = i.nextInt();
                        System.out.println(Eggs*0.3 + Applet + Bagt + Cabbaget + Donutt + Eggst);}
                else { System.out.println("Please choose from the list");}
                
                System.out.println("Do you want to continue purchasing?\ny/n\nWARNING: THE LIMIT OF REPURCHASING SINGLE IS ONLY UP TO 3 TIMES!");
                choice = i.next();
                if (!choice.equals("n")){}
                else {System.out.println("Thank You For Purchasing!");
                        break;}
                
            }
            System.out.println("Do you want to continue the transaction?\ny/n");
            Transac = i.next();
            
        } while (Transac.equals("y"));
         System.out.println("Thank You For Visiting \"Ambet's Store\"");
         
                 
        
    }
}
