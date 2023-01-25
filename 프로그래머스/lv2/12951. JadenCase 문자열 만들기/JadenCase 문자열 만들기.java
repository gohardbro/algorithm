import java.lang.*;

class Solution {
    public String solution(String s) {
        String[] strs = s.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        
       for (String str : strs) {
            if (str.length() == 0)
                sb.append(" ");
            else
                sb.append(str.substring(0, 1).toUpperCase() + str.substring(1)).append(" ");
        }
        
        if (!s.substring(s.length() -1).equals(" "))
            sb.deleteCharAt(sb.lastIndexOf(" "));
        return sb.toString();
    }
}