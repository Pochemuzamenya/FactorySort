package com.company.recursive;


import com.company.SortingAlgorithm;

public class Quick implements SortingAlgorithm {

    public static void quicksort(Object[] a, int left, int right) {
        int size = right - left + 1;
        switch (size) {
            case 0:
            case 1:
                break;
            case 2:
                if (compare(a[left], a[right]) > 0) swap(a, left, right);
                break;
            case 3:
                if (compare(a[left], a[right - 1]) > 0) swap(a, left, right - 1);
                if (compare(a[left], a[right]) > 0) swap(a, left, right);
                if (compare(a[left + 1], a[right]) > 0) swap(a, left + 1, right);
                break;
            default:
                int median = median(a, left, right);
                int partition = partition(a, left, right, median);
                quicksort(a, left, partition - 1);
                quicksort(a, partition + 1, right);
        }
    }

    private static int compare(Object a, Object b) {
        if (a == null) {
            return b == null ? 0 : -1;
        } else if (b == null) {
            return +1;
        } else {
            return ((Comparable)a).compareTo(b);
        }
    }

    private static void swap(Object[] a, int left, int right) {
        Object t = a[left];
        a[left] = a[right];
        a[right] = t;
    }

    private static int median(Object[] a, int left, int right) {
        int center = (left + right) / 2;
        if (compare(a[left], a[center]) > 0) swap(a, left, center);
        if (compare(a[left], a[right]) > 0) swap(a, left, right);
        if (compare(a[center], a[right]) > 0) swap(a, center, right);
        swap(a, center, right - 1);
        return right - 1;
    }

    private static int partition(Object[] a, int left, int right, int pivotIndex) {
        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            while (compare(a[++leftIndex], a[pivotIndex]) < 0);
            while (compare(a[--rightIndex], a[pivotIndex]) > 0);
            if (leftIndex >= rightIndex) {
                break; // pointers cross so partition done
            } else {
                swap(a, leftIndex, rightIndex);
            }
        }
        swap(a, leftIndex, right - 1);         // restore pivot
        return leftIndex;                 // return pivot location
    }

    @Override
    public void sort(Object[] items) {
        quicksort(items, 0, items.length-1);
        System.out.println("QuickSort");
    }
}
