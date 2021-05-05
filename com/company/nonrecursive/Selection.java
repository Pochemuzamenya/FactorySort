package com.company.nonrecursive;


import com.company.SortingAlgorithm;

public class Selection implements SortingAlgorithm {
    @Override
    public void sort(Object[] items){
        Object d;
        for (int currentIndex = 0; currentIndex < items.length; currentIndex++) {
            int indexToMove = currentIndex;
            for (int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < items.length; tempIndexInLoop++) {
                if (((Comparable) items[indexToMove]).compareTo(items[tempIndexInLoop]) > 0) {
                    //Swapping
                    indexToMove = tempIndexInLoop;
                }
            }
            d = items[currentIndex];
            items[currentIndex] = items[indexToMove];
            items[indexToMove] = d;
        }
   }


}
