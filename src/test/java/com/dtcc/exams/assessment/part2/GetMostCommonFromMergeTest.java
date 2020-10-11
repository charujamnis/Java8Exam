package com.dtcc.exams.assessment.part2;

import org.junit.Assert;
import org.junit.Test;

public class GetMostCommonFromMergeTest {
    @Test
    public void integerTest() {
        // Given
        Integer expected = 7;
        Integer[] inputArray = {1, 2, expected, 8, 4, 5, expected, 0, 9, 8, expected};
        Integer[] arrayToMerge = {1, 2, expected, 8, 4, 5, expected, 0, 9, 8};
        ArrayUtility<Integer> arrayUtility = new ArrayUtility<>(inputArray);

        // When
        Integer actual = arrayUtility.getMostCommonFromMerge(arrayToMerge, expected);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longTest() {
        // Given
        Long expected = 8L;
        Long[] inputArray = {1L, 2L, expected, 8L, 4L, 5L, expected, 0L, 9L, 8L, expected};
        Long[] arrayToMerge = {1L, 2L, expected, 8L, 4L, 5L, expected, 0L, 9L, 8L, expected};
        ArrayUtility<Long> arrayUtility = new ArrayUtility<>(inputArray);

        // When
        Long actual = arrayUtility.getMostCommonFromMerge(arrayToMerge, expected);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringTest() {
        // Given
        String expected = "a";
        String[] inputArray = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected};
        String[] arrayToMerge = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected, expected};

        ArrayUtility<String> arrayUtility = new ArrayUtility<>(inputArray);

        // When
        String actual = arrayUtility.getMostCommonFromMerge(arrayToMerge, expected);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void objectTest() {
        // Given
        Object expected = "a";
        Object[] inputArray = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected};
        Object[] arrayToMerge = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected, expected, expected};

        ArrayUtility<Object> arrayUtility = new ArrayUtility<>(inputArray);

        // When
        Object actual = arrayUtility.getMostCommonFromMerge(arrayToMerge, expected);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
