import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 오큰수
// 실패
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack = new Stack<>();
        int[] nums = new int[n];

        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                nums[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        int stackSize = stack.size();

        for (int i=0; i<stackSize; i++) {
            nums[stack.pop()] = -1;
        }

        for (int num : nums) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
