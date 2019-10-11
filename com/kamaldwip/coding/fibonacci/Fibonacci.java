package com.kamaldwip.coding.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int input;
        System.out.println("Enter the no. of terms.");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        System.out.println("Fibonacci sequence for first "+input+ " terms calculated iteratively is : ");
        iterativeFactorial(input);
        System.out.println("\nFibonacci sum for first "+input+ " terms calculated recursively is : "+ recursiveFactorial(input));
    }

    private static int recursiveFactorial(int input) {
        if(input <= 1){
            return input;
        }
        return recursiveFactorial(input - 1) + recursiveFactorial(input - 2);
    }

    private static void iterativeFactorial(int input) {
        if(input == 1){
            System.out.print(0 + "," + 1);
        } else if(input == 0){
            System.out.print(0);
        }
        else {
            int fibSum = 0;
            int f1 = 0;
            int f2 = 1;
            System.out.print(f1 + "," + f2);
            for (int i = 2; i <= input; i++) {
                fibSum = f1 + f2;
                System.out.print("," + fibSum);
                f1 = f2;
                f2 = fibSum;
            }
        }
    }
}
