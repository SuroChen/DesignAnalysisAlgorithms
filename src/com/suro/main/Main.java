package com.suro.main;

import com.suro.sort.Sort;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 9, 4, 6, 2, 0, 3, 8, 7};
        int i;
        Sort.bubbleSort(a);
        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
