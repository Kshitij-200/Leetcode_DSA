package search;

public class searchinStrings {

    static boolean searchString(String name, char target){

        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Kshitij pratap tomer";
        System.out.println(searchString(name, 'z'));
    }
}
