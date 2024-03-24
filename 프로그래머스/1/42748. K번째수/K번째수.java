import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        // 2차원 배열 분리
        for (int[] nums : commands) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            // 자르고
            for (int i=nums[0]-1; i<=nums[1]-1; i++) {
                arrayList.add(array[i]);
            }
            // 정렬
            Collections.sort(arrayList);
            // k번째 숫자 찾아 정답에 넣기
            answer[index] = arrayList.get(nums[2]-1);
            index++;
        }

        return answer;
    }
}