package DSA.Recursion;

public class NmultK {

    public static void multKtimes(int n, int k) {
        if (k == 0) {

            return;

        }

        multKtimes(n, k - 1);
        System.out.println(n * k);

    }

    public static void main(String[] args) {
        multKtimes(12, 5);
    }

}
