import java.util.*;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        // TC => O(26)
        // abc to z
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
