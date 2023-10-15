package DSA.Pattern;

public class InvertedRotatedHalfPyramid {

    public static void main(String[] args) {
        int line = 5;

        for (int i = 1; i <= line; i++) {

            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}

// public static void main(String[] args) {
// int n = 5; // Number of rows
// int p = 1;

// for (int i = n; i >= 1; i--) {
// // Print spaces before stars
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // Print stars
// for (int k = 1; k <= p; k++) {
// System.out.print("*");

// }

// // Move to the next line after each row
// System.out.println();

// }
// }
