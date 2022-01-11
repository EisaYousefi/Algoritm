package com.efb;

public class Eskenas {

    //حالت عادی
    public void exec() {

        for (int a = 0; a <= 5; a++) {
            for (int b = 0; b <= 10; b++) {
                for (int c = 0; c <= 25; c++) {
                    for (int d = 0; d <= 50; d++) {
                        if (a * 10 + b * 5 + c * 2 + d == 50)
                            System.out.println("a: " + a + "    b: " + b + "   c: " + c + "   d: " + d);
                    }
                }
            }
        }
    }


    //حالت بهینه
    public void exec1() {
        long d;
        for (long a = 0; a <= 5; a++) { //10k
            for (long b = 0; b <= 10 - a * 2; b++) { //5k
                for (long c = 0; c <= 25 - a * 5 - b * 2.5; c++) { //2k
                    d = 50 - a * 10 - b * 5 - c * 2; //1k
                    System.out.println("  10k: " + a + "   5k: " + b + "   2k: " + c + "   1k: " + d);

                }
            }
        }
    }
}
