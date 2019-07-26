package com.suro.sort;

public class Sort {
    public static void insertionSort(int[] a) {
        int i, j, key, n = a.length;
        for (j = 1; j < n; j++) {
            key = a[j];
            i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }
}
