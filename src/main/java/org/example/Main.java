package org.example;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<String> words = List.of("Apple", "Orange", "Strawberry", "Banana");
        Collection<String> sameWords = List.of("Apple", "Apple");
        Collection<String> noWords = List.of();
        String longestString = LongestString.findLongestString(words);
        System.out.println(longestString);
        longestString = LongestString.findLongestString(sameWords);
        System.out.println(longestString);
        longestString = LongestString.findLongestString(noWords);
        System.out.println(longestString);
    }
}