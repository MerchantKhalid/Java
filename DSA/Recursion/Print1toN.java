package DSA.Recursion;

public class Print1toN {
    public static void oneToN(int n) {
        // base case
        if (n == 1) {
            System.out.print(n);
            return;
        }

        // recursive
        oneToN(n - 1);

        // self work
        System.out.println(n);

    }

    public static void main(String[] args) {

        oneToN(5);

    }

}
