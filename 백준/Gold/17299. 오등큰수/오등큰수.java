import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 오등큰수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] nums = new int[n];

        // 맵사용하여 중복 없애면서 숫자 개수 저장
        for (int i=0; i<n; i++) {
            int num = nums[i] = Integer.parseInt(st.nextToken());
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1); // 해당 숫자 나올때 1씩 증가
        }

        // stack 에는 nums 배열의 index 값만 저장
        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && map.get(nums[stack.peek()]) < map.get(nums[i])) { // 스택이가르키는 숫자개수보다 현재 숫자개수가 더크면
                nums[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        // stack 에 남은 index 값들은 다 -1
        while (!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }

        StringJoiner sj = new StringJoiner(" ");

        for (int num : nums) {
            sj.add(String.valueOf(num));
        }

        System.out.println(sj);
    }
}
