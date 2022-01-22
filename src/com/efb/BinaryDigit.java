package com.efb;

public class BinaryDigit {

    public long recursive(long num){
        if (num==0) return 0;
        return num%2 +10*recursive(num/2);
    }
}
