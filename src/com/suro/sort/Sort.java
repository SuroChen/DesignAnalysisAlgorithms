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

    public static void bubbleSort(int[] a) {
        int i, j, key, n = a.length;
        for (i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    key = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = key;
                }
            }
        }
    }
}
