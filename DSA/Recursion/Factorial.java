package DSA.Recursion;

public class Factorial {
    public static int factorial(int n) {
        // base case
        if (n == 0)
            return 1;

        // subProblems
        // int subProblems = factorial(n - 1);

        // self work
        // int ans = n * subProblems;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
