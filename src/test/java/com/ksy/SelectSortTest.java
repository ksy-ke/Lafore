package com.ksy;

import org.junit.Assert;
import org.junit.Test;

public class SelectSortTest {
    @Test
    public void positiveNumTest() {
        SelectSort selSort = new SelectSort(new int[] {43, 23, 11, 58, 243});
        Assert.assertArrayEquals(new int[]{11, 23, 43, 58, 243}, selSort.getData());
    }

    @Test
    public void negativeNumTest() {
        SelectSort selSort = new SelectSort(new int[] {-55, 534, 62, -435, -1});
        Assert.assertArrayEquals(new int[]{-435, -55, -1, 62, 534}, selSort.getData());
    }
}