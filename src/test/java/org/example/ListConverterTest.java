package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListConverterTest {

    ListConverter listConverter;

    @BeforeEach
    void setup() {
        this.listConverter = new ListConverter();
    }

    //toArray
    @Test
    void givenIntegerListWhenCalledShouldReturnIntegerArray() {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4));
        Integer[] expectedResult = {1, 2, 3, 4};
        var actualResult = listConverter.toArray(integerList);
        assertEquals(true, Arrays.equals(expectedResult, actualResult));

    }

    @Test
    void givenEmptyListWhenCalledShouldReturnEmptyArray() {
        List<Integer> integerList = new ArrayList<>();
        Integer[] expectedResult = {};
        var actualResult = listConverter.toArray(integerList);
        assertEquals(true, Arrays.equals(expectedResult, actualResult));
    }

    @Test
    void givenNullWhenCalledShouldThrowException_toArray() throws Exception {
        List<Integer> integerList = null;
        assertThrows(Exception.class, () -> listConverter.toArray(integerList));
    }

    //toList
    @Test
    void givenIntegerArrayWhenCalledShouldReturnIntegerList() {
        Integer[] integerArray = {1, 2, 3, 4};
        List<Integer> expectedResult = new ArrayList<>(List.of(1, 2, 3, 4));
        var actualResult = listConverter.toList(integerArray);
        assertEquals(true, expectedResult.equals(actualResult));
    }

    @Test
    void givenEmptyArrayWhenCalledShouldReturnEmptyList() {
        Integer[] integerArray = {};
        List<Integer> expectedResult = new ArrayList<>();
        var actualResult = listConverter.toList(integerArray);
        assertEquals(true, expectedResult.equals(actualResult));
    }

    @Test
    void givenNullWhenCalledShouldThrowException_toList() throws Exception {
        Integer[] integerArray = null;
        assertThrows(Exception.class, () -> listConverter.toList(integerArray));
    }

}