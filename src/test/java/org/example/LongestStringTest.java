package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LongestStringTest {

    Collection<String> words;

    @BeforeEach
    void setup() {
        words = new ArrayList<>();
    }

    @Test
    void givenDifferentStringsWhenCalledThenShouldReturnLongestString() {
        words.addAll(List.of("Apple", "Orange", "Strawberry", "Banana"));
        String expectedResult = "Strawberry";
        String actualResult = LongestString.findLongestString(words);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenSameLengthStringsWhenCalledThenShouldReturnEitherOne() {
        words.addAll(List.of("Apple", "Apple"));
        String expectedResult = "Apple";
        String actualResult = LongestString.findLongestString(words);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenEmptyListWhenCalledShouldReturnEmptyString() {
        String expectedResult = "";
        String actualResult = LongestString.findLongestString(List.of());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenNullWhenCalledShouldReturnException() throws NullPointerException {
        assertThrows(NullPointerException.class, () -> LongestString.findLongestString(null));
    }


}