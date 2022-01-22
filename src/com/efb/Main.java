package com.efb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("*----------------------------------------------------------------*");
        System.out.println("*                                                مقسوم علیه :  1 *");
        System.out.println("*                                                   عدد اول :  2 *");
        System.out.println("*                         تبدیل اعداد زوج به جمع دو عدد اول :  3 *");
        System.out.println("*                          پیدا کردن اعداد اول به روش غربال :  4 *");
        System.out.println("*                                                  ب . م .م :  5 *");
        System.out.println("*                                      تجزیه به عاملهای اول :  6 *");
        System.out.println("*               الگوریتم خرد کردن یک اسکناس  50 هزار تومانی :  7 *");
        System.out.println("*                                              سری فیبوناچی :  8 *");
        System.out.println("*                                                  فاکتوریل :  9 *");
        System.out.println("*                                                مثلث اعداد : 10 *");
        System.out.println("*                                                      توان : 11 *");
        System.out.println("*       یافتن کوچکترین عدد یا بزرگترین عدد یا  هر دوی  آنها : 12 *");
        System.out.println("*                                            جستجویی دودویی : 13 *");
        System.out.println("*                                            مرتب سازی سریع : 14 *");
        System.out.println("*                                                 مثلث خیام : 15 *");
        System.out.println("*                                          تولید عدد باینری : 16 *");
        System.out.println("*                                            جمع کردن اعداد : 17 *");
        System.out.println("*  گذاشتن اعضا کنار هم {1و2و3}={11و12و13و21و22و23و31و32و33} : 18 *");
        System.out.println("*                                 برعکس کردن آرایه(Reverse) : 19 *");
        System.out.println("*----------------------------------------------------------------*");
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
            case 12 -> minOrMaxNum();
            case 13 -> searchBinery();
            case 14 -> quickSort();
            case 15 -> MKH();
            case 16 -> binaryDigit();
            case 17 -> sum();
            case 18 -> printPairs();
            case 19 -> revers();
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
        //divisor.calculateSqr(getNum());
        System.out.println(divisor.recursive(getNum(),getNum()));

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
        TriangleNumber t = new TriangleNumber();
        t.exec(getNum());
    }

    private static void tavan() {
        Tavan tavan = new Tavan();
       // System.out.println(tavan.exec(getNum(), getNum()));
//        System.out.println(tavan.simple(getNum(),getNum()));
        long recursion = tavan.recursion(getNum(),getNum());
        System.out.println(recursion);
    }

    private static void minOrMaxNum() {
    }

    private static void searchBinery() {
        SearchItemInArray s = new SearchItemInArray();
        int[] array = new int[200000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
       // int[] array = new int[]{100, 1, 50, 500, 65, 0, 2, 5};

        System.out.println("============");
        System.out.println(s.binSearch(s.quickSort(array), 0, array.length, getNum()));
    }

    private static void quickSort() {
        int[] arr = new int[]{100, 1, 50, 500, 65, 0, 2, 5};

       /*
         int[] arr = new int[1000000];
         for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
      */

        int n = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        quickSort.printArray(arr, n);


    }

    private static void MKH() {
        KhayamM khayamM=new KhayamM();
        khayamM.khayam();
    }

    private static void binaryDigit() {
        BinaryDigit binaryDigit = new BinaryDigit();
        System.out.println(binaryDigit.recursive(getNum()));
    }

    private static void sum() {
        long[] array = new long[]{1,3,4,5};
        Sum.spofArray(array);
    }

    private static void printPairs() {
        long[] array = new long[]{1,2,3,4,5};
        long[] arrayA = new long[]{100,0,20,5,1};
        long[] arrayB = new long[]{20,1,20,4,2};
       // PrintPairs.printPairs(arrayA);
        //PrintPairs.triangle90(arrayA);
        PrintPairs.printUnorderedPairs(arrayA,arrayB);
    }

    private static void revers() {
        int[] array = new int[]{1,2,10,4,5};
        QuickSort quickSort = new QuickSort();
        System.out.println("Reverse");
        quickSort.reverse(array);
        System.out.println("Sort And Reverse");
        quickSort.sortAndReverse(array);
    }
}
