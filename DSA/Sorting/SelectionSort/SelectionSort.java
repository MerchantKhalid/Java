package DSA.Sorting.SelectionSort;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minElement = i;

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minElement]) {
                    minElement = j;
                }
            }
            // swap element
            int temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }

}
