package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class TicTacToe {
    static void start() {
        char[][] field = createField();
        drawField(field);

        while (true) {
            doPlayerMove(field);
            if (isWin(field, 'X') || isDraw(field)) {
                break;
            }

            doAIMove(field);
            if (isWin(field, 'O') || isDraw(field)) {
                break;
            }
        }
    }

    static boolean isWin(char[][] field, char sign) {
        return checkWinnerHorizontal(field) ||
                checkWinnerVertical(field) ||
                checkWinnerDiagonals(field);
    }

    static boolean checkWinnerHorizontal(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            boolean res = true;
            for (int j = 1; j < field.length && res; j++)
                res = field[i][j] == field[i][0];
            if (res)
                return true;
        }
        return false;
    }

    static boolean checkWinnerVertical(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            boolean res = true;
            for (int j = 1; j < field.length && res; j++)
                res = field[j][i] == field[0][i];
            if (res)
                return true;
        }
        return false;
    }

    static boolean checkWinnerDiagonals(char[][] field) {
        boolean res = true;
        for (int i = 1; i < field.length && res; i++)
            res = field[i][i] == field[0][0];
        if (res)
            return true;
        res = true;
        for (int i = 1; i < field.length && res; i++)
            res = field[field.length - i - 1][i] == field[field.length - 1][0];
        return res;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (isCellFree(field, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int row, col;

        do {
            row = random.nextInt(field.length);
            col = random.nextInt(field.length);
        } while (isCellOccupied(field, row, col));

        field[row][col] = 'O';
        drawField(field);
    }

    static void doPlayerMove(char[][] field) {
        int row;
        int col;
        do {
            System.out.println("Please input coordinates...");
            row = getCoordinate("row");
            col = getCoordinate("col");
        } while (isCellOccupied(field, row, col));

        field[row][col] = 'X';
        drawField(field);
    }

    static boolean isCellFree(char[][] field, int row, int col) {
        return !isCellOccupied(field, row, col);
    }

    static boolean isCellOccupied(char[][] field, int row, int col) {
        return field[row][col] != '-';
    }

    static int getCoordinate(String coordType) {
        Scanner scanner = new Scanner(System.in);
        int coord;

        do {
            System.out.printf("Please input %s-coordinate [1-3]...%n", coordType);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= 3);

        return coord;
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}