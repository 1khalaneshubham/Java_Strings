import java.util.*;

public class Substring {

    public static String GetSubString(String str,int si, int ei){

        String substr = "";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //Substring
        String str = "HelloWorld";
        System.out.println(str.substring(0,7)); // mathed aahe bahi hee..
        System.out.println(GetSubString(str,0,7)); // hey aahe function jayt aapn pass kart aahe

    }
}
