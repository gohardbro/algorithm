package baekjoon.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 좌표 정렬하기
// 시간초과 뜸
public class No11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] nums = new String[n];
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(nums[i], " ");
            x[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);
        String[] res = new String[n];

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                String[] split = nums[j].split(" ");

                if (x[i] == Integer.parseInt(split[0])) {
                    res[i] = nums[j];
                    nums[j] = "100001 100001";
                    break;
                }
            }
        }

        for (int k : x) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < res.length; j++) {
                String[] split = res[j].split(" ");

                if (k == Integer.parseInt(split[0])) {
                    arrayList.add(Integer.parseInt(split[1]));
                    res[j] = "100001 100001";
                }
            }

            int size = arrayList.size();
            if (size > 0) {
                Integer[] integers = arrayList.toArray(new Integer[size]);
                Arrays.sort(integers);

                for (int y : integers)
                    sb.append(k).append(" ").append(y).append("\n");
            }
        }

        System.out.println(sb);
    }
}
