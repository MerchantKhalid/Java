package DSA.Recursion;

public class Fibonacci {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = fibo(n - 1) + fibo(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibo(i));
        }
    }

}
