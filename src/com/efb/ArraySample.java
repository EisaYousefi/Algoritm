package com.efb;

import java.util.Arrays;

public class ArraySample {

    public static void int2DArray() {

        int[][] int2DArray;
        int2DArray = new int[2][2];
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        System.out.println(Arrays.deepToString(int2DArray));

        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2DArray));

    }

    //پیدا کردن  تعداد معدل های که از میانگین معدل ها بیشتر هستند
    public static void average(long numDays) {
        long sum = 0;
        long[] temps = new long[(int) numDays];
        for (int i = 0; i < temps.length; i++) {
            long next = Main.getNum();
            temps[i] = next;
            sum += next;
        }
        double average = 0.0;
        if (numDays > 0)
            average = sum / numDays;

        int above = 0;//چند نف معدلشان بالاتر از میانگین معدل هاست
        for (long temp : temps) {
            if (temp > average) {
                above++;
                System.out.print(temp + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Average : " + average);
        System.out.println("above : " + above);
    }

    //پیدا کردن عدد گم شده در بین این بازه عددی     n*(n=1)/2
    public static void missingNumber() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10};
        int sum1 = 0, sum2 = 0;
        for (int item : array
        ) {
            sum1 += item;
        }
        sum2 = 10 * (10 + 1) / 2;
        int difference = sum2 - sum1;
        System.out.println("missing Number is : " + difference);
    }

    //حاصل جمع کدام دو عدد در آرایه میشود target
    public static int[] TowSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("no solution found");
    }

    public static String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + " , "
                            + Integer.toString(intArray[j]);

                }
            }
        }
        return pairs;
    }

    //پیدا کردن آرایه های که اعضای تکراری دارند
    public static boolean isUnique(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //ازکجا بفهمیم دو تا آرایه با هم یکی هستند
    public static boolean permutation(int[] arrayA, int[] arrayB) {
        if (arrayA.length != arrayB.length) return false;
        int sumA = 0;
        int sumB = 0;
        int mulA = 1;
        int mulB = 1;
        for (int i = 0; i < arrayA.length; i++) {
            sumA += arrayA[i];
            sumB += arrayB[i];
            mulA *= arrayA[i];
            mulB *= arrayB[i];
        }
        return (sumA == sumB && mulA == mulB);
    }

    public static boolean rotateMatrix90(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }


}























