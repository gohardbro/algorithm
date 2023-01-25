import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A); // 오름차순 정렬
        
        // 내림차순 정렬
        Integer[] temp = new Integer[B.length];
        
        for (int i=0; i<B.length; i++) {
            temp[i] = B[i];
        }
        
        Arrays.sort(temp, Collections.reverseOrder());
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * temp[i];
        }

        return answer;
    }
}