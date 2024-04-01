/*  생각
    1. priorities배열을 queue에 넣으면서 동시에 ArrayList에 저장
    2. location 저장위한 queue 따로 생성
    3. List 내림차순 정렬
    3. priorities queue를 List 첫번째 원소와 비교하면서 offer, poll 
    4. 동시에 location queue에도 똑같이 offer, poll 하면서 offer없이 poll만 하는경우 cnt++
    5. poll한 값 = location이면 중지, 결과는 cnt값
*/
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> priorQueue = new LinkedList<>();
        Queue<Integer> locationQueue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            priorQueue.offer(priorities[i]);
            list.add(priorities[i]);
            locationQueue.offer(i);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        int cnt = 0;
        
        while (true) {
            Integer polledPrior = priorQueue.poll();
            Integer polledLocation = locationQueue.poll();
            
            if (polledPrior < list.get(0)) {
                priorQueue.offer(polledPrior);
                locationQueue.offer(polledLocation);
            } else {
                list.remove(0);
                cnt++;
                
                if (polledLocation == location) break;
            }
        }
        
        return cnt;
    }
}