package com.ksy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void positiveNumTest() {
        BubbleSort bubSort = new BubbleSort(new int[]{43, 23, 11, 58, 243});
        assertArrayEquals(bubSort.getData(), new int[]{11, 23, 43, 58, 243});
    }

    @Test
    public void negativeNumTest() {
        BubbleSort bubSort = new BubbleSort(new int[]{-55, 534, 62, -435, -1});
        assertArrayEquals(bubSort.getData(), new int[]{-435, -55, -1, 62, 534});
    }

    @Test
    public void testIBrokeYourCode() {
        BubbleSort bubSort = new BubbleSort(new int[]{-55, 534, 62, -435, -1});
        assertArrayEquals(bubSort.getData(), new int[]{-435, -55, -1, 62, 534});
        bubSort.getData()[0] = 10000;
        System.out.println(Arrays.toString(bubSort.getData()));
        assertArrayEquals(bubSort.getData(), new int[]{-435, -55, -1, 62, 534});
    }
}
