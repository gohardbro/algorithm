import java.util.*;
// 문자열 하나씩 순회하면서 
// 현재 검사중인 문자가 '(' 이면 stack에 push
// ')' 이라면 peek해서 결과가 empty가 아니면서 '('라면 pop
// 아니면 false 리턴

// 최종에 stack이 비어있으면 true
// 아니면 false

class Solution {
    boolean solution(String s) {
        boolean answer;
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        if (stack.size() > 0) answer = false;
        else answer = true;
        
        return answer;
    }
}