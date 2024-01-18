import java.util.*;

public class StringCompae {
    public static void main(String[] args) {
        
        String s1 = "Shubham"; // ha old aahe
        String s2 = "Shubham"; // old madhe store hot 
        String s3 = new String("Shubham"); // new objcat tayer kart

          if(s1 == s2){
            System.out.println("String are Equale");
          }else{
            System.out.println("String are not Equale");
          }


          if(s1 == s3){
            System.out.println("String are Equale");
          }else{
            System.out.println("String are not Equale");
          }

          
          if(s1.equals(s3)){ // new cha check karny sathi .equale cha used hot  
            System.out.println("String are Equale");
          }else{
            System.out.println("String are not Equale");
          }
    }
}
