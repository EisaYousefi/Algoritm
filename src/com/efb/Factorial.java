package com.efb;

public class Factorial {

    public long fact(long num) {
        if (num < 0) return -1;
        if (num <= 1) return 1;
        return num * (fact(num - 1));
    }
}
