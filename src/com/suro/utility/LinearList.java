package com.suro.utility;

import java.util.Arrays;

public class LinearList {
    public static void merge(Comparable[] a, int p, int q, int r) {
        int i, j, k, n1 = q - p + 1, n2 = r - q;
        Comparable[] L = Arrays.copyOfRange(a, p, q + 1);
        Comparable[] R = Arrays.copyOfRange(a, q + 1, r + 1);
        i = j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) < 0) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }
        if (i < n1) {
            for (; i < n1; i++) {
                a[k++] = L[i];
            }
        }
        if (j < n2) {
            for (; j < n2; j++) {
                a[k++] = R[j];
            }
        }
    }

    public static int search(int[] a, int v) {
        int n = a.length, i = 0;
        while (i < n && a[i] != v) {
            i++;
        }
        if (i >= n)
            return -1;
        return i;
    }
}
