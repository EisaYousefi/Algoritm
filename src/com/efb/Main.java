package com.efb;

import com.efb.linkedList.SinglyLinkedList;
import com.efb.menuReply.SubMenu;
import com.efb.menuReply.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
     /*     System.out.println("*----------------------------------------------------------------*");
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
        System.out.println("*  یافتن بزرگترین معدل ها از میانگین تمامی معدل ها/آرایه ها : 20 *");
        System.out.println("*              یافتن عدد جا افتاده در بین اعداد آرایه 1تا10 : 21 *");
        System.out.println("*                              یافتن {2و6و3و9و11}-> 6+3 = 9 : 22 *");
        System.out.println("*                     پیدا کردن بزرگترین دو عدد در یک آرایه : 23 *");
        System.out.println("*     پیدا کردن uniqueArray  (آرایه ای که عضو تکراری نداره) : 24 *");
        System.out.println("*       پیدا کردن دو آرایه برابر که اعضای آن ها جابجا هستند : 25 *");
        System.out.println("*                   چرخش 90 درجه یک ماتریس (آرایه چند بعدی) : 26 *");
        System.out.println("* 27 : SingleLinkedList                                          *");
        System.out.println("*----------------------------------------------------------------*");
        System.out.println();

      Scanner in = new Scanner(System.in);
        System.out.print("یکی از اعداد بالا را انتخاب  کنید:                                 ");
        int s = in.nextInt();
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
            case 20 -> arrays();
            case 21 -> missingNumber();
            case 22 -> pairsTowSum();
            case 23 -> maxProduct();
            case 24 -> isUniqueArray();
            case 25 -> permutation();
            case 26 -> rotateMatrix();
            case 27 -> singleLinkedList();
        }*/


        List<SubMenu> subMenus = new ArrayList<>();
        TreeNode root = new TreeNode("Golpayegani", 1);
        TreeNode t1 = new TreeNode("Hammed", 2);
        TreeNode t2 = new TreeNode("Mohammad", 3);
        TreeNode t3 = new TreeNode("Jamali", 4);
        TreeNode t11 = new TreeNode("Eisa", 5);
        TreeNode t12 = new TreeNode("Javad", 6);
        TreeNode t13 = new TreeNode("Reza", 6);
        TreeNode t21 = new TreeNode("Hamid", 7);
        TreeNode t22 = new TreeNode("Farid", 8);
        TreeNode t31 = new TreeNode("Masomi", 8);


        root.addChild(t1,root.id);
        root.addChild(t2,root.id);
        root.addChild(t3,root.id);

        t1.addChild(t11,t1.id);
        t1.addChild(t12,t1.id);
        t1.addChild(t13,t1.id);
        t2.addChild(t21,t2.id);
        t2.addChild(t22,t2.id);

        t22.addChild(t31,t22.id);

        System.out.println(root.print(0));

        System.out.println(root.find(t1.id , root ));
    }

    public static long getNum() {
        long n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = in.nextInt();
        return n;
    }

    private static void divisor() {
        Divisor divisor = new Divisor();
        //divisor.calculateSqr(getNum());
        System.out.println(divisor.recursive(getNum(), getNum()));

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
        long recursion = tavan.recursion(getNum(), getNum());
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
        System.out.println(Arrays.toString(arr));


    }

    private static void MKH() {
        KhayamM khayamM = new KhayamM();
        khayamM.khayam();
    }

    private static void binaryDigit() {
        BinaryDigit binaryDigit = new BinaryDigit();
        System.out.println(binaryDigit.recursive(getNum()));
    }

    private static void sum() {
        long[] array = new long[]{1, 3, 4, 5};
        Sum.spofArray(array);
    }

    private static void printPairs() {
        long[] array = new long[]{1, 2, 3, 4, 5};
        long[] arrayA = new long[]{100, 0, 20, 5, 1};
        long[] arrayB = new long[]{20, 1, 20, 4, 2};
        // PrintPairs.printPairs(arrayA);
        //PrintPairs.triangle90(arrayA);
        PrintPairs.printUnorderedPairs(arrayA, arrayB);
    }

    private static void revers() {
        int[] array = new int[]{1, 2, 10, 4, 5, 6};
        QuickSort quickSort = new QuickSort();
        System.out.println("Reverse");
        quickSort.reverse(array);
        System.out.println("Sort And Reverse");
        quickSort.sortAndReverse(array);
    }

    private static void arrays() {
        // ArraySample.int2DArray();
        ArraySample.average(getNum());
    }

    private static void missingNumber() {
        ArraySample.missingNumber();
    }

    private static void pairsTowSum() {
        int nums[] = new int[]{2, 3, 6, 9, 11};
        int target = 9;
        int[] result = ArraySample.TowSum(nums, target);
        System.out.println("nums : " + Arrays.toString(nums) +
                "  target : " + target);

        System.out.println("TowSumIndex : " + Arrays.toString(result));
        System.out.println(nums[result[0]] + " + " +
                nums[result[1]] + " = " + target);

        System.out.println("-----------------------------");
        int nums1[] = new int[]{2, 100, 8, 1, 7, 9, 13};
        int target1 = 8;
        int[] result1 = ArraySample.TowSum(nums1, target1);
        System.out.println("nums1 : " + Arrays.toString(nums1) +
                "  target1 : " + target1);

        System.out.println("TowSumIndex: " + Arrays.toString(result1));
        System.out.println(nums1[result1[0]] + " + " +
                nums1[result1[1]] + " = " + target1);
    }

    private static void maxProduct() {
        int nums[] = new int[]{2, 200, 8, 1, 7, 9, 130, 140};
        System.out.println(Arrays.toString(nums));
        System.out.println(ArraySample.maxProduct(nums));
    }

    private static void isUniqueArray() {
        int nums[] = new int[]{1, 2, 3, 5, 6};
        // int nums[]=new int[]{1,2,3,5,6,1};
        System.out.println(Arrays.toString(nums));
        System.out.println(ArraySample.isUnique(nums));
    }

    private static void permutation() {
        int numsA[] = new int[]{1, 2, 3, 5, 4, 6};
        int numsB[] = new int[]{1, 3, 4, 5, 2, 6};
        System.out.println(Arrays.toString(numsA));
        System.out.println(Arrays.toString(numsB));
        System.out.println(ArraySample.permutation(numsA, numsB));
        ;
    }

    private static void rotateMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(ArraySample.rotateMatrix90(matrix));
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void singleLinkedList() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.next);
        System.out.println(sll.head.value);

        sll.insertInLinkedList(0, 0);
        System.out.println(sll.head.next);
        System.out.println(sll.head.value);

        sll.insertInLinkedList(2, 2);
        System.out.println(sll.head.next);
        System.out.println(sll.head.next.next.value);

        sll.insertInLinkedList(3, 3);
        System.out.println(sll.head.next);
        System.out.println(sll.head.next.next.next.value);


        sll.insertInLinkedList(1, 1);
        System.out.println(sll.head.next);
        System.out.println(sll.head.next.value);

        System.out.println(sll.size);


    }
}
