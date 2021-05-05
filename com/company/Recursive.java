package com.company;

import com.company.nosort.NoSort;
import com.company.recursive.Quick;

public class Recursive extends SortFactory{
    @Override
    SortingAlgorithm getAlgorithm(String algorithm) {
        if (algorithm.equals("quick")) return new Quick();
        else return new NoSort();
    }
}
