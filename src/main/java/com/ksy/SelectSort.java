package com.ksy;

public class SelectSort {
    private int[] data;

    SelectSort(int[] data) {
        this.data = data;
        selSort();
    }

    private void selSort() {
        for (int outer = 0; outer < data.length; outer++) {
            int pos = outer;
            for (int i = outer + 1; i < data.length; i++) {
                if (data[i] < data[pos]) {
                    pos = i;
                }
            }
            if (outer != pos) {
                int temp = data[outer];
                data[outer] = data[pos];
                data[pos] = temp;
            }
        }
    }

    int[] getData() { return data.clone(); }
}