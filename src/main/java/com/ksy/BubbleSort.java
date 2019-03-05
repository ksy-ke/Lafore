package com.ksy;

public final class BubbleSort {
    private final int[] data;

    BubbleSort(int[] array) {
        data = array.clone();
        bubSort();
    }

    private void bubSort() {
        for (int last = data.length - 1; last >= 1; last--) {
            for (int i = 0; i < last; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
    }

    int[] getData() { return data.clone(); }
}
