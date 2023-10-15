package DSA.Sorting.SelectionSort;

public class Lexicographical {

    public static void selectionFruits(String[] fr) {
        for (int i = 0; i < fr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < fr.length; j++) {
                if (fr[j].compareTo(fr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // swap
            String temp = fr[i];
            fr[i] = fr[minIndex];
            fr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = { "Papaya", "Mango", "Apple" };
        selectionFruits(fruits);
        for (String val : fruits) {
            System.out.print(val + " ");
        }
    }

}
