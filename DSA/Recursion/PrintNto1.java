package DSA.Recursion;

public class PrintNto1 {
    public static void nToOne(int n) {
        // base case
        if (n == 1) {
            System.out.print(n);
            return;
        }

        // self work
        System.out.print(n);

        // recursive call
        nToOne(n);
    }

    public static void main(String[] args) {
        nToOne(5);
    }

}
