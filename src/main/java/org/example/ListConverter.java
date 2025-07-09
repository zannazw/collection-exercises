package org.example;

import java.util.Arrays;
import java.util.List;

public class ListConverter {

    // Convert the given List<Integer> into an Integer[] array and return the array.
    public Integer[] toArray(List<Integer> list) {
        return list.toArray(Integer[]::new);
    }

    // Convert the given Integer[] array into a List<Integer> and return the list.
    public List<Integer> toList(Integer[] array) {
        return Arrays.asList(array);
    }
}
