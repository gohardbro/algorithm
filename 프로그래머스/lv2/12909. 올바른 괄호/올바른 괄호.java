import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if (stack.empty()) {
                
                if (s.charAt(i) == '(') {
                    stack.push('(');
                } else {
                    return false;
                }
                
            } else {
                if (s.charAt(i) == '(') {
                    stack.push('(');
                } else {
                    stack.pop();
                }
            }
        }
        
        if (!stack.empty())
            answer = false;
        
        return answer;
    }
}