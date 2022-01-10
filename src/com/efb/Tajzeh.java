package com.efb;

public class Tajzeh {

    public void t(long a) {
        long b = 2;
        do {

            if (a % b == 0) {
                System.out.println(a + "    " +  b);
                a = a / b;
            } else
                b++;
        }while (a>1);
    }

    public void t(long a , long b) {
        if (a>1)
            if (a % b == 0) {
                System.out.println(a + "    " + b);
                t(a / b, b );
            }else
                t(a , b+1 );

    }
}

