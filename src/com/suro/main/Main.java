package com.suro.main;

import com.suro.algorithm.Hanoi;
import com.suro.utility.Greater;
import com.suro.utility.LinearList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[] current = {'A', 'A', 'A', 'A'};
        char A = 'A', B = 'B', C = 'C';
        Hanoi.hanoi(current, 4, A, B, C);
    }

//    public static void main(String[] args) {
//        int i;
//        Integer[] a = {1, 2, 5, 8, 9, 0, 3, 4, 6, 7};
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
//    }

//    public static void main(String[] args) {
//        int i, j;
//        Integer[] a = {1, 2, 5, 8, 9, 0, 3, 4, 6, 7};
//        ArrayList<Integer> A = new ArrayList<>();
//        for (i = 0; i < 10; i++) {
//            A.add(a[i]);
//        }
//        j = LinearList.partition((List) A, 0, 9, new Greater());
//        System.out.println(A);
//        System.out.println(j);
//    }
}
