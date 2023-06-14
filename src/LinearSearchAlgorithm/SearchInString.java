package LinearSearchAlgorithm;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "SaySomething";
        char target = 'i';
        System.out.println(SearchInStrings(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean SearchInStrings(String str, char target){
       if (str.length() == 0){
           return false;
       }

        for (char ch: str.toCharArray()) {
            if (ch == target){
                return  true;
            }
        }
        return  false;
    }
}
