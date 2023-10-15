package DSA.Recursion;

public class PsquareQ {
    public static int pSquareQ(int p, int q) {
        if (q == 0)
            return 1;
        int smallPw = pSquareQ(p, q / 2);
        if (q % 2 == 0) {

            return smallPw * smallPw;
        } else {
            smallPw = smallPw * smallPw * p;
        }
        return smallPw;

    }
    // if (q == 0)
    // return 1;

    // return pSquareQ(p, q - 1) * p;
    // }

    public static void main(String[] args) {
        System.out.print(pSquareQ(5, 4));

    }

}
