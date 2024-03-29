package com.suro.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public static void merge(List<Comparable> a, int p, int q, int r, Comparator comp) {
        int i, j, k, n1 = q - p + 1, n2 = r - q;
        Comparable[] L = new Comparable[n1];
        Comparable[] R = new Comparable[n2];
        for (i = 0; i < n1; i++) {
            L[i] = a.get(p + i);
        }
        for (j = 0; j < n2; j++) {
            R[j] = a.get(q + 1 + j);
        }
        i = j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (comp.compare(L[i], R[j]) < 0) {
                a.set(k++, L[i++]);
            } else {
                a.set(k++, R[j++]);
            }
        }
        if (i < n1) {
            for (; i < n1; i++) {
                a.set(k++, L[i]);
            }
        }
        if (j < n2) {
            for (; j < n2; j++) {
                a.set(k++, R[j]);
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

    public static int binerySearch(int[] a, int p, int r, int v) {
        if (p > r) {
            return -1;
        }
        int q = (p + r) / 2;
        if (a[q] == v) {
            return q;
        }
        if (v < a[q]) {
            return binerySearch(a, p, q - 1, v);
        } else {
            return binerySearch(a, q + 1, r, v);
        }
    }

    public static int partition(List<Comparable> a, int p, int r, Comparator comp) {
        Comparable x;
        int i, j;
        x = a.get(r);
        i = p - 1;
        for (j = p; j < r; j++) {
            if (comp.compare(a.get(j), x) <= 0) {
                i++;
                Collections.swap(a, i, j);
            }
        }
        Collections.swap(a, i + 1, r);
        return i + 1;
    }

    public static int randmizedPartition(List<Comparable> a, int p, int r, Comparator comp) {
        int i = p + (int) ((double) (r - p) * Math.random());
        Collections.swap(a, i, r);
        return partition(a, p, r, comp);
    }

    public static int select(List<Comparable> a, int p, int r, int i, Comparator comp) {
        if (p == r)
            return (int) a.get(p);
        int q = randmizedPartition(a, p, r, comp);
        int k = q - p + 1;
        if (i == k) {
            return (int) a.get(q);
        } else if (i < k) {
            return select(a, p, q - 1, i, comp);
        } else {
            return select(a, q + 1, r, i - k, comp);
        }
    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public static int right(int i) {
        return 2 * i + 2;
    }

    public static int parent(int i) {
        if (i % 2 == 1)
            return i / 2;
        return i / 2 - 1;
    }

    public static void heapify(List<Comparable> a, int i, int heapSize, Comparator comp) {
        int l = left(i), r = right(i), most;
        if ((l < heapSize) && (comp.compare(a.get(l), a.get(i)) > 0)) {
            most = l;
        } else {
            most = i;
        }
        if (r < heapSize && comp.compare(a.get(r), a.get(most)) > 0) {
            most = r;
        }
        if (most != i) {
            Collections.swap(a, i, most);
            heapify(a, most, heapSize, comp);
        }
    }

    public static void buildHeap(List<Comparable> a, Comparator comp) {
        int heapSize = a.size();
        for (int i = heapSize / 2; i >= 0; i--) {
            heapify(a, i, heapSize, comp);
        }
    }
}
