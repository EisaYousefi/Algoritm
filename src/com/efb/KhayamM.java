package com.efb;

public class KhayamM {
    public void khayam(){
        int[] p;
        int n;
        p= new int[10];

        for (int i = 0; i < p.length; i++) {
            p[i]= 1;
            for (int j = i-1; j >0 ; j--) {
                p[j]=p[j-1]+p[j];
                for (int k = 0; k<=i; k++) {
                    System.out.print(p[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
