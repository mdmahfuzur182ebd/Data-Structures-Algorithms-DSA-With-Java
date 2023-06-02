package Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 4, 22, 44};
        System.out.println(max(arr));
        //System.out.println(maxRange(arr, 0,4));
    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = start; i < end; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
