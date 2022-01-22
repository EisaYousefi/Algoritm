package com.efb;

public class Tavan {


    //روش معمولی
    public float simple(long num, long n) {
        float calc = 1;
        for (int i = 0; i < n; i++) {
            calc = calc * num;
        }
        return calc;
    }

    //روش سریع
    public float exec(long num, long n) {
        if (n == 1)
            return num;
        float y = exec(num, n / 2);
        if (n % 2 == 0)
            return y * y; // if n even
        else
            return y * y * num; //if n odd
    }

    public long recursion(long base, long exp){
        if (exp==0 ||exp==1)
            return base;
        if (exp<0||base<0){
            System.out.println("base or exp > 0");
            return -1;
        }
        return base * recursion(base,exp-1);
    }
}
