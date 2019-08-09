package com.suro.main;

import com.suro.algorithm.Hanoi;
import com.suro.algorithm.Sort;
import com.suro.utility.Greater;
import com.suro.utility.Less;
import com.suro.utility.LinearList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int i;
        Integer[] a = {5, 1, 9, 4, 6, 2, 0, 3, 8, 7};
        String[] b = {"ChongQing", "ShangHai", "AoMen", "TianJin", "BeiJing", "XiangGang"};
        Double[] c = {8.5, 6.3, 1.7, 9.2, 0.5, 2.3, 4.1, 7.4, 5.9, 3.7};
        ArrayList<Integer> A = new ArrayList<>();
        for (i = 0; i < 10; i++) {
            A.add(a[i]);
        }
        Vector<String> B = new Vector<>();
        for (i = 0; i < 6; i++) {
            B.add(b[i]);
        }
        LinkedList<Double> C = new LinkedList<>();
        for (i = 0; i < 10; i++) {
            C.add(c[i]);
        }
        Sort.quickSort((List) A, 0, 9, new Greater());
        System.out.println(A);
        Sort.quickSort((List) B, 0, 5, new Less());
        System.out.println(B);
        Sort.quickSort((List) C, 0, 9, new Greater());
        System.out.println(C);
    }

//    public static void main(String[] args) {
//        int[] a = {5, 1, 9, 4, 6, 2, 0, 3, 8, 7};
//        Sort.insertionSort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        int r = LinearList.binerySearch(a, 0, 9, 7);
//        System.out.println();
//        System.out.println(r);
//    }

//    public static void main(String[] args) {
//        int i;
//        Integer[] a = {5, 1, 9, 4, 6, 2, 0, 3, 8, 7};
//        String[] b = {"ChongQing", "ShangHai", "AoMen", "TianJin", "BeiJing", "XiangGang"};
//        Double[] c = {8.5, 6.3, 1.7, 9.2, 0.5, 2.3, 4.1, 7.4, 5.9, 3.7};
//        ArrayList<Integer> A = new ArrayList<>();
//        for (i = 0; i < 10; i++) {
//            A.add(a[i]);
//        }
//        Vector<String> B = new Vector<>();
//        for (i = 0; i < 6; i++) {
//            B.add(b[i]);
//        }
//        LinkedList<Double> C = new LinkedList<>();
//        for (i = 0; i < 10; i++) {
//            C.add(c[i]);
//        }
//        Sort.mergeSort((List) A, 0, 9, new Greater());
//        System.out.println(A);
//        Sort.mergeSort((List) B, 0, 5, new Less());
//        System.out.println(B);
//        Sort.mergeSort((List) C, 0, 9, new Greater());
//        System.out.println(C);
//    }

//    public static void main(String[] args) {
//        char[] current = {'A', 'A', 'A', 'A'};
//        char A = 'A', B = 'B', C = 'C';
//        Hanoi.hanoi(current, 4, A, B, C);
//    }

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
