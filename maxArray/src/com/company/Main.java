package com.company;

public class Main {

    public static void main(String[] args) {
        long[] anArray;
        anArray = new long[5];
        anArray[0] = 151025156;
        anArray[1] = 232035155;
        anArray[2] = 625065515;
        anArray[3] = 543016515;
        anArray[4] = 151000004;

        long a = 0;
        int i = 0;

        while (i != 5) {
            if (a < anArray[i]) {
                a = anArray[i];
                i = i + 1;


            } else {
                i = i + 1;
            }
        }
        System.out.print(a);

    }
}
