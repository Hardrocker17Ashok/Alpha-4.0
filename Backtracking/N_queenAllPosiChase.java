package Backtracking;

public class N_queenAllPosiChase {

    // PRINT ALL POSIBILITIES FOR QUEEN PLACE IN CHASE BOARD
    // it take O(n!) time complexity.....
    
    public static boolean isSafe(char arr[][], int row, int col) {
        // For vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        // For digonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        // For digonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nqueen(char arr[][], int row) {
        if (row == arr.length) {
            printarray(arr);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, row, i)) {
                arr[row][i] = 'Q';
                nqueen(arr, row + 1); // function call
                arr[row][i] = 'x'; // backtracking
            }
        }
    }

    public static void printarray(char array[][]) {
        System.out.println("______ChaseBord_______");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 'x';
            }
        }
        nqueen(arr, 0);
    }
}
