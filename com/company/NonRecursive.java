package com.company;

import com.company.nonrecursive.Insertion;
import com.company.nonrecursive.Selection;
import com.company.nosort.NoSort;

public class NonRecursive extends SortFactory {
    @Override
    SortingAlgorithm getAlgorithm(String algorithm) {
        if (algorithm .equals( "insertion")) return new Insertion();
        if (algorithm.equals( "selection")) return new Selection();
        else return new NoSort();
    }
}
