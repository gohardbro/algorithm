import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            Queue<int[]> queue = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int status = Integer.parseInt(st.nextToken());

                list.add(status);
                queue.offer(new int[] {j, status});
            }

            int setSize = list.size();
            Integer[] nums = list.toArray(new Integer[setSize]);
            int cnt = 0;

            while (!queue.isEmpty()) {
                Arrays.sort(nums);

                if (queue.peek()[1] < nums[nums.length-1]) {
                    queue.offer(queue.poll());
                } else {
                    int[] current = queue.poll();
                    nums[nums.length-1] = 0;
                    cnt++;

                    if (current[0] == m)
                        break;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
