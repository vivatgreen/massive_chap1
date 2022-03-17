package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1 и 2
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }

        System.out.println();
        // Задача 3
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }

        System.out.println("\n");
        // Задача 1 и 2
        double[] array = {1.57, 7.654, 9.986};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1)
                System.out.print(", ");
        }

        System.out.println();
        // Задача 3
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1)
                System.out.print(", ");
        }

        System.out.println("\n");
        // Задача 1 и 2
        int[] arraya = {13, 14, 15, 17, 20, 28};
        for (int i = 0; i < arraya.length; i++) {
            System.out.print(arraya[i]);
            if (i != arraya.length - 1)
                System.out.print(", ");
        }

        System.out.println();
        // Задача 3
        for (int i = 0; i < arraya.length / 2; i++) {
            int temp = arraya[i];
            arraya[i] = arraya[arraya.length - i - 1];
            arraya[arraya.length - i - 1] = temp;
        }
        for (int i = 0; i < arraya.length; i++) {
            System.out.print(arraya[i]);
            if (i != arraya.length - 1)
                System.out.print(", ");
        }

        System.out.println("\n");
        //Задача 4
        int[] arr1 = new int[]{1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) arr1[i] += 1; {
                System.out.print(arr1[i]);
                if (i != arr1.length - 1)
                    System.out.print(", ");
            }
        }
    }
}



