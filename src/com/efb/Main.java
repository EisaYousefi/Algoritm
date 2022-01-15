package com.efb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("*--------------------------------------------------------------*");
        System.out.println("*                                                مقسوم علیه :  1 *");
        System.out.println("*                                                   عدد اول :  2 *");
        System.out.println("*                         تبدیل اعداد زوج به جمع دو عدد اول :  3 *");
        System.out.println("*                          پیدا کردن اعداد اول به روش غربال :  4 *");
        System.out.println("*                                                  ب . م .م :  5 *");
        System.out.println("*                                      تجزیه به عاملهای اول :  6 *");
        System.out.println("*               الگوریتم خرد کردن یک اسکناس  50 هزار تومانی :  7 *");
        System.out.println("*                                            : سری فیبوناچی :  8 *");
        System.out.println("*                                                : فاکتوریل :  9 *");
        System.out.println("*                                              : مثلث اعداد : 10 *");
        System.out.println("*                                                    : توان : 11 *");
        System.out.println("*--------------------------------------------------------------*");
        System.out.println();
        int s;
        Scanner in = new Scanner(System.in);
        System.out.print("یکی از اعداد بالا را انتخاب  کنید:                                 ");
        s = in.nextInt();
        switch (s) {
            case 1 -> divisor();
            case 2 -> primeNumber();
            case 3 -> convertEvenNumberToTowPrimeNumber();
            case 4 -> gharbal();
            case 5 -> bmm();
            case 6 -> tajze();
            case 7 -> eskanas();
            case 8 -> febonachi();
            case 9 -> factorial();
            case 10 -> MA();
            case 11 -> tavan();
        }

    }

    private static long getNum() {
        long n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = in.nextInt();
        return n;
    }

    private static void divisor() {
        Divisor divisor = new Divisor();
        divisor.calculateSqr(getNum());
    }

    private static void primeNumber() {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.calculate(getNum());

    }

    private static void convertEvenNumberToTowPrimeNumber() {
        ConvertEvenNumberToTowPrimeNumber c = new ConvertEvenNumberToTowPrimeNumber();
        c.exec(getNum());
    }

    private static void gharbal() {
        Gharbal gharbal = new Gharbal();
        gharbal.exec(getNum());
    }

    private static void bmm() {
        BMM bmm = new BMM();
        System.out.println("BMM -------------> =  " + bmm.bmmBazgashti(getNum(), getNum()));
    }

    private static void tajze() {
        Tajzeh tajzeh = new Tajzeh();
        tajzeh.t(getNum(), 2);
    }

    private static void eskanas() {
        Eskenas eskenas = new Eskenas();
        eskenas.exec1();
    }

    private static void febonachi() {
        Fibonachi fibonachi = new Fibonachi();
        fibonachi.exec(getNum());
    }

    private static void factorial() {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(getNum()));
        ;

    }

    private static void MA() {
        TriangleNumber t = new TriangleNumber()  ;
        t.exec(getNum());
    }

    private static void tavan() {
        Tavan tavan = new Tavan();
//        System.out.println(tavan.exec(getNum(),getNum()));
        System.out.println(tavan.simple(getNum(),getNum()));
    }
}
