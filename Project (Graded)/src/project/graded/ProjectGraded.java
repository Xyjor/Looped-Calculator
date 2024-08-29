/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.graded;

import java.util.Scanner;

/**
 *
 * @author YANGYANG_COMP111
 */
public class ProjectGraded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Input = new Scanner(System.in);
       
      
        System.out.println("Roj's Calculator");
        System.out.println("Input the First Rational Number: ");
        double num1 = Input.nextDouble();
        System.out.println("Input the Second Rational Number: ");
        double num2 = Input.nextDouble();
        
        System.out.println("Choose an Operation:");
        System.out.println("1 for Addition (+)");
        System.out.println("2 for Subtraction (-)");
        System.out.println("3 for Multiplication (x)");
        System.out.println("4 for Division (/)");
        System.out.println("Operation to use (1/2/3/4): ");
        
        int Op = Input.nextInt();
        double Res = 0;
       
       switch (Op) {
           case 1:
               Res = num1 + num2;
               System.out.println("Result: " + num1 + "+" + num2 + "=" + Res);
               break;
               
           case 2:
               Res = num1 - num2;
               System.out.println("Result: " + num1 + "-" + num2 + "=" + Res);
               break;
               
           case 3:
               Res = num1 * num2;
               System.out.println("Result: " + num1 + " x " + num2 + "=" + Res);
               break;
               
           case 4:
               if (num2 != 0) {
                    Res = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + Res);}
                else {
                    System.out.println("Math Error!");}
                break;
            
           default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;}  
       
    
    
    
    
    }
    
    
}
       
       
       
       
      
    
    

