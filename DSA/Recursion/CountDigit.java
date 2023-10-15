package DSA.Recursion;

public class CountDigit {

    public static int countDigit(int n) {

        // Base case
        if (n >= 0 && n <= 9) {
            return n;
        }

        // recursive calls
        int digit = (n % 10);

        int ans = countDigit(n / 10) + digit;

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(countDigit(1234));

    }

}
