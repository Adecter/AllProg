package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum = 0;
        while (sum != 625) {
            if (a != 26) {
                sum = a * b;
                System.out.print(" " + sum + " ");
                a = a + 1;


            } else {
                a = 1;
                System.out.println("");
                b = b + 1;
            }
        }
    }
}
