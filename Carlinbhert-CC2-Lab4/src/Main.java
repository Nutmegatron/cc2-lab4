//Carlinbhert Adryanne De Guzman
//CITCS 1N-A
//September 21, 2024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner to take user input for the total  amount
        Scanner myDiscount = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: ");
        double totalAmount = myDiscount.nextDouble();

//        if else statement to determine how much of a discount a person gets based on the total amount
        if (totalAmount <= 1000) {
            System.out.println("Discount applied: 0%");
            System.out.println("Final price after discount: PHP " + totalAmount);
        } else if (totalAmount >= 1000 && totalAmount <= 5000) {
            double firstDiscount = totalAmount * 0.05;
            System.out.println("Discount applied: 5%");
            System.out.println("Final price after discount: PHP " + (totalAmount - firstDiscount));
        } else if (totalAmount >= 5001 && totalAmount <= 10000) {
            double secondDiscount = totalAmount * 0.10;
            System.out.println("Discount applied: 10%");
            System.out.print("Final price after discount: PHP " + (totalAmount - secondDiscount));
        } else {
            double thirdDiscount = totalAmount * 0.15;
            System.out.println("Discount applied: 15%");
            System.out.println("Final price after discount: PHP " + (totalAmount - thirdDiscount));
        }
    }
}