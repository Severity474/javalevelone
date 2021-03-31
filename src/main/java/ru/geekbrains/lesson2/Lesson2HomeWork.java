package ru.geekbrains.lesson2;

public class Lesson2HomeWork {

    public static void main(String[] args) {
        int[] numbers = getNumbers();
        int[] numbers2 = new int[100];
        int[] numbers3 = getNumbers3();


        iterateOverArray();
        changeArrayNumbers(numbers);
        addArrayNumbers2(numbers2);
        changeArrayNumbers3(numbers3);
    }

    static int[] getNumbers() {
        int[] values = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        return values;
    }

    static int[] getNumbers3() {
        int[] values = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        return values;
    }

    static void changeArrayNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else if (numbers[i] == 1) {
                numbers[i] = 0;
            }
            System.out.println(numbers[i]);
        }
    }

    static void addArrayNumbers2(int[] numbers2) {
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i+1;
            System.out.println(numbers2[i]);
        }
    }

    static void changeArrayNumbers3(int[] numbers3) {
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] < 6) {
                numbers3[i] = numbers3[i] * 2;
            }
            System.out.println(numbers3[i]);
        }
    }

    static void iterateOverArray() {
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void work5(int len, int initialValue) {
        int[] numbers5 = new int[len];
        for (int i = 0; i < numbers5.length; i++) {
            numbers5[i] = initialValue;
        }
    }
}

