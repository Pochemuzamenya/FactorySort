package com.company.nosort;

import com.company.SortingAlgorithm;

import java.util.Arrays;

public class NoSort implements SortingAlgorithm {
    @Override
    public void sort(Object[] items) {
        System.out.println("Массив не отсортирован");
        System.out.println("Ошибка в названии алгоритма");
        System.out.println(Arrays.toString(items));
    }
}
