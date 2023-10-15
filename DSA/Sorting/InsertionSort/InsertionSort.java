package DSA.Sorting.InsertionSort;

public class InsertionSort {
    public static void selectionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 9, 6, 4, 2, 1 };
        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a);
        }
    }
}
