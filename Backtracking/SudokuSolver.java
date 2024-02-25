package Backtracking;

public class SudokuSolver {

    public static boolean isSafe(int arr[][], int row, int col, int digit) {
        /*
         * for find starting row and coloumn of any indexs box
         * use this formula for stating row => (row/3)*3
         * use this formula for stating col => (col/3)*3
         * because in sudoku nine 3*3 matrix are prasent
         */

        // check for col
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == digit) {
                return false;
            }
        }
        // check for row
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == digit) {
                return false;
            }
        }
        // check in 3*3 grid
        int sr = row / 3 * 3;
        int sc = col / 3 * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudoku(int arr[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextrow = row;
        int nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (arr[row][col] != 0) {
            return sudoku(arr, nextrow, nextcol);
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(arr, row, col, i)) {
                arr[row][col] = i;
                if (sudoku(arr, nextrow, nextcol)) {
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        sudoku(arr, 0, 0);
        print(arr);
    }
}
