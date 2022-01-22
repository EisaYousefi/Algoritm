package com.efb;

public class PrintPairs {

    public static void printPairs(long[] array){
        printArray(array);
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                System.out.print(array[i]+""+array[j] +", ");
            }
        }
    }

    public static void triangle90(long[] array){
        printArray(array);

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                System.out.print(array[i]+""+array[j] +" ");
            }
            System.out.println();
        }
    }

    public static void printUnorderedPairs(long[] arrayA,long[] arrayB){


        for (int i = 0; i <arrayA.length ; i++) {
            for (int j =0; j <arrayB.length ; j++) {
               if (arrayA[i]<arrayB[j]){
                   System.out.print(arrayA[i]+","+arrayB[j]+"  ");
               }
            }
            System.out.println();
        }
    }

    private static void printArray(long[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" , ");
        }
        System.out.println("}");
        System.out.println("===========================================================");
    }

}
