package com.suro.algorithm;

import com.suro.utility.LinearList;

import java.util.Comparator;
import java.util.List;

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

    public static int getTheInvertion(int[] a) {
        int i, j, key, n = a.length, count = 0;
        for (j = 1; j < n; j++) {
            key = a[j];
            i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
                count++;
            }
            a[i + 1] = key;
        }
        return count;
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

    public static void mergeSort(List<Comparable> a, int p, int r, Comparator comp) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q, comp);
            mergeSort(a, q + 1, r, comp);
            LinearList.merge(a, p, q, r, comp);
        }
    }

    public static void quickSort(List<Comparable> a, int p, int r, Comparator comp) {
        if (p < r) {
            int q = LinearList.randmizedPartition(a, p, r, comp);
            quickSort(a, p, q, comp);
            quickSort(a, q + 1, r, comp);
        }
    }
}
