package com.company;

public class Main {

    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[5];
        anArray[0] = 0;
        anArray[1] = 1;
        anArray[2] = 2;
        anArray[3] = 3;
        anArray[4] = 4;

        int a = 0;

        while (a!=4) {
            for (int i = 1; i < anArray.length; ++i) {
                if (a < anArray[i]) {
                    a = anArray[i];

                    System.out.println(a);

                }
            }
        }
    }
}
// dont work if array=1243,return=124; (need=1 2 3 4) or (need=0 1 2 3 4)
