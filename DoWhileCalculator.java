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
public class DoWhileCalculator {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       
        int choice;
        double totalCost = 0.0;
        boolean Buy = true;

        do {
            System.out.println("""
                Welcome to "AMBET's STORE"! Choose an item to buy:
                1. Apple        - 15.00 $
                2. Bag          - 300.00 $
                3. Copper Wire  - 20.00 $
                4. Donut        - 35.00 $
                5. Eggs         - 12.00 $
                6. Exit
                """);

            System.out.print("Enter the number your item choice: ");
            choice = in.nextInt();

            double itemcost = 0.0;
            String itemname = "";

            switch (choice) {
                case 1 -> {
                    itemcost = 15.00;
                    itemname = "Apple";
                }
                case 2 -> {
                    itemcost = 300.00;
                    itemname = "Bag";
                }
                case 3 -> {
                    itemcost = 20.00;
                    itemname = "Copper Wire";
                }
                case 4 -> {
                    itemcost = 35.00;
                    itemname = "Donut";
                }
                case 5 -> {
                    itemcost = 12.00;
                    itemname = "Eggs";
                }
                case 6 -> {
                    Buy = false;
                    System.out.println("EXITING \"AMBET's STORE\"");}
                default -> System.out.println("Invalid choice. Please select again.");
            }

            if (choice >= 1 && choice <= 5) {
                System.out.println("You chose " + itemname + ".");

                System.out.printf("Quantity ( %s ): ", itemname);
                int quantity = in.nextInt();

                if (quantity > 0) {
                    totalCost += itemcost * quantity;
                    System.out.printf("%d %s added to the cart.%n", quantity, itemname);
                    System.out.printf("Current total payment amount: %.2f$%n", totalCost);
                } else {
                    System.out.println("Invalid quantity. Please enter a valid amount.");
                }
            }

            if (Buy) {
                System.out.print("Do you want to continue shopping? (y/n): ");
                String continueShopping = in.next();
                if (continueShopping.equalsIgnoreCase("n")) {
                    Buy = false;
                }
            }

        } while (Buy);

        System.out.printf("Your final total payment: %.2f$%n", totalCost);

        double amountPaid = 0.0;

        while (amountPaid < totalCost) {
            System.out.print("Enter the amount of money: ");
            double additionalPayment = in.nextDouble();
            amountPaid += additionalPayment;

            if (amountPaid >= totalCost) {
                double change = amountPaid - totalCost;
                System.out.printf("Payment successful! Your change is: %.2f$%n ", change);
                break;
            } else {
                double amountOwed = totalCost - amountPaid;
                System.out.printf("Insuffecient amount. Owed Payment: %.2f$%n", amountOwed);
                System.out.print("Do you want to add more money? (y/n): ");
                String more = in.next();
                if (more.equalsIgnoreCase("n")) {
                    System.out.println("You canceled the transaction." + "\nOwed Paymnet: " + amountOwed + "$" + "\n" + "\n" + "EXITING \"AMBET's STORE \"");
                    break;
                }
            }
        }

        System.out.println("Thank you for shopping!");

        
    }
}