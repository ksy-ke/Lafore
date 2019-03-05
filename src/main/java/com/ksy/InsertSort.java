package com.ksy;

public class InsertSort {
    private int[] data;

    public InsertSort(int[] data) {
        this.data = data.clone();
        insSort();
    }

    private void insSort() {
        for (int outer = 1; outer < data.length; outer++) {
            int temp = data[outer];
            int inner = outer;
            while (inner > 0 && data[inner - 1] >= temp) {
                data[inner] = data[inner - 1];
                inner--;
            }
            data[inner] = temp;
        }
    }

    private void insSortWithIf() {
        for (int outer = 1; outer < data.length; outer++) {
            int temp = data[outer];
            for (int current = outer - 1; current >= 0; current--) {
                if (temp < data[current]) {
                    data[current + 1] = data[current];
                    if (current == 0) { data[current] = temp; }
                } else {
                    data[current + 1] = temp;
                    break;
                }
            }
        }
    }

    int[] getData() { return data.clone(); }
}
