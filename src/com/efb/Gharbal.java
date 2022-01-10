package com.efb;

public class Gharbal {



    public void exec(long n){
        PrimeNumber primeNumber = new PrimeNumber();
        for (int i = 1; i <=n ; i++) {
            if (primeNumber.prime(i))
                System.out.println(i);
        }
    }
}
