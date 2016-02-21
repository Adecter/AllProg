package com.company;

public class Main {

    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[5];
        anArray[0] = 15;
        anArray[1] = 23;
        anArray[2] = 62;
        anArray[3] = 54;
        anArray[4] = 1;

        int a = 10000000;
        int i = 0;

        while (i != 5) {
            if (a > anArray[i]) {
                a = anArray[i];
                i = i + 1;


            } else {
                i = i + 1;
            }
        }
        System.out.print(a);

    }
}
