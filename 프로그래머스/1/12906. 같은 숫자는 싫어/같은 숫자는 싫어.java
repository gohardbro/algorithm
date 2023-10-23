import java.util.*;
// 배열 인덱스를 뒤에서부터 하나씩 검사해서
// 스택에 peek 해서 나온 값이 같은숫자가 아니면 넣는다.
// 그렇게 해서 만들어진 스택 사이즈 크기와 같은 int[]를 만들고
// 스택을 pop 하면서 나온 값을 차례로 int[] 에 넣고 반환한다.
public class Solution {
    
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i=arr.length-1; i>=0; i--) {
            if(stack.empty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}