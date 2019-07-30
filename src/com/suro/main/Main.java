package com.suro.main;

import com.suro.sort.Sort;
import com.suro.utility.LinearList;

public class Main {
    public static void main(String[] args) {
        //测试GitHub
        int i;
        int[] a = {1, 2, 5, 8, 9, 0, 3, 4, 6, 7};
//        String[] b = {"AoMen", "BeiJing", "ShangHai", "ChongQing", "TianJin", "XiangGang"};
//        Double[] c = {0.5, 3.7, 6.3, 8.5, 9.2, 1.7, 2.3, 4.1, 5.9, 7.4};
//        LinearList.merge(a, 0, (a.length - 1) / 2, a.length - 1);
//        for (i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        LinearList.merge(b, 0, (b.length - 1) / 2, b.length - 1);
//        for (i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//        System.out.println();
//        LinearList.merge(c, 0, (c.length - 1) / 2, c.length - 1);
//        for (i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }
        int result = LinearList.search(a, 1);
        System.out.print(result + " " + a[result]);
        System.out.println();
    }
}
