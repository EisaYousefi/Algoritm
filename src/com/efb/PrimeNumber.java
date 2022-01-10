package com.efb;

/*
 * الگوریتم به دست آوردن عدد اول
 *
 * */
public class PrimeNumber {

    public void calculate(long n) {
        if (prime(n)) {
            System.out.print(n + "  is prime Number");
        } else {
            System.out.print(n + " not is prime Number");
        }
    }

    public boolean prime(long n) {
        if (n <= 1) return false;
        if (n > 2 && n % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
