package com.suro.main;

import com.suro.sort.Sort;

public class Main {
    public static void main(String[] args) {
        int[] A = {5, 1, 9, 4, 6, 2, 0, 3, 8, 7};
        int i;
        Sort.insertionSort(A);
        for (i = 0; i < 10; i++)
            System.out.print(A[i] + " ");
        System.out.println();
    }
}
