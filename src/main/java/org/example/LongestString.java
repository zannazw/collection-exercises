package org.example;

import java.util.Collection;

// Finds the longest string in a collection; returns "" if none found.

public class LongestString {

    static String findLongestString(Collection<String> words) {
        return words.stream().max((str1, str2) -> Integer.compare(str1.length(), str2.length())).orElse("");
        //return words.stream().max(String::compareTo).orElse("");
    }

}
