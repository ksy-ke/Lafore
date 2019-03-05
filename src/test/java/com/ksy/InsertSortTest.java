package com.ksy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertSortTest {
    @Test
    public void positiveNumTest() {
        InsertSort insSort = new InsertSort(new int[]{43, 23, 11, 58, 243});
        assertArrayEquals(insSort.getData(), new int[]{11, 23, 43, 58, 243});
    }

    @Test
    public void negativeNumTest() {
        InsertSort insSort = new InsertSort(new int[]{-55, 534, 62, -435, -1});
        assertArrayEquals(insSort.getData(), new int[]{-435, -55, -1, 62, 534});
    }

    @Test
    public void testIBrokeYourCode() {
        InsertSort insSort = new InsertSort(new int[]{-55, 534, 62, -435, -1});
        assertArrayEquals(insSort.getData(), new int[]{-435, -55, -1, 62, 534});

        insSort.getData()[0] = 10000;
        assertArrayEquals(insSort.getData(), new int[]{-435, -55, -1, 62, 534});
    }
}