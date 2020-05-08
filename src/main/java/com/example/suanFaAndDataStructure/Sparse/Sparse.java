package com.example.suanFaAndDataStructure.Sparse;


public class Sparse {


    public static void main(String[] args) {
        // 源  二维数组
        int[][] source = new int[5][6];
        source[0][1] = 1;
        source[3][3] = 2;
        source[1][2] = 1;

        System.out.println("1.源二维数组:  ");
        print(source);


        /**
         *  二位数组转稀疏数组
         */
        int[][] sparseArray = toSparseArray(source);
        System.out.println("2.二位转的稀疏数组 sparseArray :  ");
        print(sparseArray);


        /**
         * 稀疏数组转二位数组
         */
        int[][] array = toArray(sparseArray);
        System.out.println("3.稀疏数组转二位数组 array :  ");
        print(array);
    }

    private static int[][] toArray(int[][] sparseArray) {
        int row = sparseArray[0][0];
        int rol = sparseArray[0][1];
        int[][] array = new int[row][rol];

        for (int i = 1; i < sparseArray.length; i++) {
            int[] item = sparseArray[i];
            int i2 = item[0];
            int i3 = item[1];
            array[i2][i3]= item[2];
        }

        return  array;
    }


    private static int[][] toSparseArray(int[][] source) {
        int sum = 0;
        for (int[] integers : source) {
            for (int val : integers) {
                if (val != 0) {
                    sum++;
                }
            }
        }

        int sparseArray[][] = new int[sum + 1][3];
        // 第一行总览
        sparseArray[0][0] = source.length;
        sparseArray[0][1] = source[0].length;
        sparseArray[0][2] = sum;

        // 记录后续的数值分布
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            int[] item = source[i];
            for (int j = 0; j < item.length; j++) {
                if (item[j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = item[j];
                }
            }
        }


        return sparseArray;
    }



    private static void print(int[][] source) {
        for (int[] integers : source) {
            for (int integer : integers) {
                System.out.print("  " + integer);
            }
            System.out.println();
        }
    }


}
