package ru.kirillova.arraystask.main;

import static ru.kirillova.arraystask.service.Sorter.sort;

public class Main {
    public static void main(String[] args) {
        int[]arr = {4, -2, 7, 1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}