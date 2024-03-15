import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<progresses.length; i++) {
            if ((100-progresses[i]) % speeds[i] == 0)
                queue.offer((100-progresses[i]) / speeds[i]);
            else
                queue.offer((100-progresses[i]) / speeds[i]+1);
        }

        int beforeNum = queue.poll();
        int cnt = 1;
        while (!queue.isEmpty()) {
            if (beforeNum >= queue.peek()) {
                cnt++;
                queue.poll();
            } else {
              arrayList.add(cnt);
              cnt = 1;
              beforeNum = queue.poll();
            }
        }
        // 마지막 배포
        arrayList.add(cnt);

        int[] answer = new int[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}