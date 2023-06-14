package LinearSearchAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {34,643,13,11,54,23,55,33};
        int data = LinerSearch(arr,23);
        System.out.println(data);
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int LinerSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // Run for loop
        for (int index = 0; index<arr.length; index++){
            // Check for element at every index if it is = target
            int element = arr[index];   // element = arr[index]
            if (element == target){
                return index;  //element//1
            }
        }
        // the line will execute if none of the return statements above have executed
        // hence the target not found
        //return  -1;
        return Integer.MAX_VALUE;
    }
}
