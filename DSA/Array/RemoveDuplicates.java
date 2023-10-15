package DSA.Array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 2, 3, 4, 5, 6 };
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueList = new HashSet<>();

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                resultList.add(num);
                uniqueList.add(num);

            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}

// public class RemoveDuplicates {
// public static void main(String[] args) {

// int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6 };
// int[] result = removeDuplicates(arr);

// System.out.println(Arrays.toString(result));

// }

// public static int[] removeDuplicates(int[] arr) {
// Set<Integer> uniqueElements = new HashSet<>();

// ArrayList<Integer> resultList = new ArrayList<>();

// for (int num : arr) {
// if (!uniqueElements.contains(num)) {
// resultList.add(num);
// uniqueElements.add(num);

// }
// }

// // convert the result list back to an Array
// int[] result = new int[resultList.size()];
// for (int i = 0; i < resultList.size(); i++) {
// result[i] = resultList.get(i);
// }
// return result;

// }

// }
