package com.efb;

public class Sum {

    public static void spofArray(long[] array){
        int sum = 0 ; int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            product*=array[i];
        }

        System.out.println("Sum :"+sum +"  product :"+product);

    }
}
