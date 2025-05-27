package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            result[row] = board[row][row];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
            for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X') {
                boolean rowWin = true;
                for (int cell = 0; cell < board[row].length; cell++) {
                    if (board[row][cell] != 'X') {
                        rowWin = false;
                        break;
                    }
                }
                boolean cellWin = true;
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[cell][row] != 'X') {
                        cellWin = false;
                        break;
                    }
                }
                return rowWin || cellWin;
            }
        }
        return false;
    }
   }
