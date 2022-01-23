package com.efb;

import java.util.Scanner;

/*
 * الگوریتم به دست آوردن مقسوم علیه
 *
 * */
public class Divisor {

    public void calculate(long n) {
        if (n < 2) {
            calculateSimple(n);
        } else {
            calculateSqr(n);
        }
    }

    // یک راهش اینه که یه حلقه بذازیم  که خیلی زمان بر میشه
    public void calculateSimple(long n) {
        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    /*
     چون تا جذر اون عدد اعداد در می آیند و بقیه برعکسش هستند پس حلقه تا جذر عدد ادامه داره و بقیه بر عکس ها رو چاپ می کنیم
      مثلا 30/6=5    پس هم 5 هست و هم 6
     */
    public void calculateSqr(long n) {
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                System.out.println(i + "     " + n / i);
        }
    }

    public long recursive(long a, long b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return recursive(b, a % b);
    }
}
