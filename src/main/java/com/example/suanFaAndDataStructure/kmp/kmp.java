package com.example.suanFaAndDataStructure.kmp;


public class kmp {


    public static void printArray(int[] array) {
        System.out.println();
        for (int i : array) {
            System.out.print( i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String source="ABEBCED ABCES ADSEBA AVABA BAABE ABEAB";
        String target ="ABEABE";
        int[] kmpNext = kmpNext(target);
        printArray(kmpNext);
        int i = kmpSearch(source, target, kmpNext);
        System.out.printf("获取到的数是 %s",i );

    }


    /**
     * 获取匹配位置
     * @param source   源
     * @param target    匹配字符串
     * @param next  部分匹配表  str2生成
     * @return
     */
    public static int kmpSearch(String source, String target, int[] next) {
        for (int i = 0, j = 0; i < source.length(); i++) {
            // 核心
            while (j > 0 && source.charAt(i) != target.charAt(j)) {
                j = next[j - 1];
            }
            if (source.charAt(i) == target.charAt(j)) {
                j++;
            }
            if (j == target.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }


    /**
     * 获取目标串的部分匹配表
     *
     * @param target 匹配字符串
     * @return 部分匹配表
     */
    public static int[] kmpNext(String target) {
        int[] next = new int[target.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < target.length(); i++) {
            // 核心
            while (j > 0 && target.charAt(i) != target.charAt(j)) {
                j = next[j - 1];
            }
            if (target.charAt(i) == target.charAt(j)) {
                j++;
            }
            next[i] = j;
        }

        return next;
    }





}
