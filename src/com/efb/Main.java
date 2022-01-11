package com.efb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(" 1: مقسوم علیه");
        System.out.println(" 2: عدد اول ");
        System.out.println(" 3: تبدیل اعداد زوج به جمع دو عدد اول ");
        System.out.println(" 4: پیدا کردن اعداد اول به روش غربال ");
        System.out.println(" 5: ب . م .م ");
        System.out.println(" 6: تجزیه به عاملهای اول ");
        System.out.println(" 7: الگوریتم خرد کردن یک اسکناس  50 هزار تومانی");
        System.out.println(" 8: سری فیبوناچی ");

        System.out.println("=============================");
        int s;
        Scanner in = new Scanner(System.in);
        System.out.print("یکی از اعداد بالا را انتخاب  کنید: ");
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
}
