package TernarySearach;

public class TernarySearch {
    // Driver code
    public static void main(String[] args)
    {
        int l, r, p, key;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        l = 0; // start index
        r = arr.length -1 ; // end index
        key = 5;  // target value
        // Search the key using ternarySearch
        p = ternarySearch(l, r, key, arr);
        // Print the result
        System.out.println("Index of " + key + " is " + p);
    }
    static int ternarySearch(int l, int r, int key, int[] arr)
    {
        if (r >= l) {

            // Find the mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            // Check if key is present at any mid
            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }

            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region

            if (key < arr[mid1]) {

                // The key lies in between l and mid1
                //end = mid1 -1;
                return ternarySearch(l, mid1 - 1, key, arr);
            }
            else if (key > arr[mid2]) {

                // The key lies in between mid2 and r
                // start = mid2+1;
                return ternarySearch(mid2 + 1, r, key, arr);
            }
            else {

                // The key lies in between mid1 and mid2
                // start = mid1 + 1;
                // end = mid2 - 1;
                return ternarySearch(mid1 + 1, mid2 - 1, key, arr);
            }
        }

        // Key not found
        return -1;
    }

}
//Best case time complexity is O(1), and worst-case complexity is O (log N base 3).
//vNote: Array needs to be sorted to perform ternary search on it.
/*Steps to perform Ternary Search:

    First, we compare the key with the element at mid1. If found equal, we return mid1.
    If not, then we compare the key with the element at mid2. If found equal, we return mid2.
    If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
    If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
    If not, then we recur to the second (middle) part.
  */