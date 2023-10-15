package DSA.Pattern;

public class HollowReactangle {

    public static void main(String[] args) {

        int row = 5;
        int col = 10;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {

                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

// public class HollowReactangle {
// public static void main(String[] args) {
// int rows = 5; // Number of rows
// int cols = 10; // Number of columns

// for (int i = 1; i <= rows; i++) {
// for (int j = 1; j <= cols; j++) {
// if (i == 1 || i == rows || j == 1 || j == cols) {
// // Print asterisk for the first row, last row, first column, and last column
// System.out.print("*");
// } else {
// // Print a space for the inner part of the rectangle
// System.out.print(" ");
// }
// }
// // Move to the next line after each row
// System.out.println();
// }
// }
// }
