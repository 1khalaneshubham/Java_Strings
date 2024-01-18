import java.util.*;

// Check if a String is a Palindrom 'racecar','noon','Madam' 
public class Palindrome {

    public static boolean Number(String str) {

        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        //  String str = "noon";
        //  String str = "ma'am";
        System.out.println(Number(str));
    }
}
