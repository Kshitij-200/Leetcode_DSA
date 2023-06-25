package Strings;

public class skipAppNotApple {
    static String skipApp_Apple(String str){
        if (str.isEmpty()){
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")){
            return skipApp_Apple(str.substring(3));
        }
        else {
            return str.charAt(0) + skipApp_Apple(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "bacappplecdah";
        System.out.println(skipApp_Apple(str));
    }
}
