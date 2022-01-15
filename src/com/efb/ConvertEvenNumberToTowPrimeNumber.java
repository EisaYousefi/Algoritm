package com.efb;

/*
 * تبدیل اعداد زوج به جمع دو عدد اول
 *
 * */
public class ConvertEvenNumberToTowPrimeNumber {

    private boolean prime(long n){
        if (n<=1) return false;
        if (n>2 && n%2==0) return false;
        for (long i = 3; i <=Math.sqrt(n) ; i+=2) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    public void exec(long n){
        for (int i = 3; i <n/2 ; i+=2) {
            if (prime(i) && prime(n-i)){
                System.out.println(i+"    +    " + (n-i+"    = "+n));
            }
        }
    }



}
