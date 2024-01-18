import java.util.*;

public class StringCharAT{

    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         
        String firstName = "Shubham";
        String Lastname = "Khalane";
        String fullname = firstName + " " + Lastname;
        System.out.println(fullname.charAt(10));
        printLetters(fullname);
    }
}
