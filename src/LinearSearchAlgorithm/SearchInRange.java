package LinearSearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12,-7,3,14, 28};
        int ans = SearchRange(arr, 14,1,4);
        System.out.println(ans);

    }


    static int SearchRange(int[] arr, int target ,int start, int end ){
        if(arr.length == 0){
            return -1;
        }

        // Run for loop
        for (int index = start; index<=end; index++){
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


