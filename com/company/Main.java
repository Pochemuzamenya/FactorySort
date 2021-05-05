package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array1 = {"dog", "cat", "parrot", "ocelot", "hummingbird", "giraffe"};
        Integer[] array2 = {0,4,5,2,9,10,3};
        Character[] array3 = {'a','x','b','f','c'};
        Double [] array4 = {0.12,10.34,23.0,-1.0,3.143432};

        SortFactory nFactory = new NonRecursive();
        SortingAlgorithm algorithm = nFactory.getAlgorithm("insertion");
        algorithm.sort(array1);

        algorithm = nFactory.getAlgorithm("selection");
        algorithm.sort(array2);

        SortFactory rFactory = new Recursive();
        algorithm = rFactory.getAlgorithm("quick");
        algorithm.sort(array3);


        //nosort for array4
        algorithm = rFactory.getAlgorithm("qsort");
        algorithm.sort(array4);

        //Print arrays
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

    }
}
