package LinearSearchAlgorithm;

public class SearchInString {
    public static void main(String[] args) {
        String name = "SaySomething";
        char target = 'i';
        System.out.println(SearchInStrings(name, target));

    }

    static boolean SearchInStrings(String str, char target){
       if (str.length() == 0){
           return false;
       }

        for (int i = 0; i <str.length() ; i++) {
            if (target == str.trim().charAt(i)){
                return true;
            }
        }
        return  false;
    }
}
