package ArrayBasic;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{23,55,55}, {34,23,65}};
        //arr[0][0] = 44;
       // System.out.println(arr);
//        System.out.println(arr[1].length);
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
        for (int i = 0; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
