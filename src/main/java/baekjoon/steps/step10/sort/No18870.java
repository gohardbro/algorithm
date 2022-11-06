package baekjoon.steps.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 좌표 압축
// 시간 초과 뜸
public class No18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            set.add(nums[i]); // set 이용 중복 없이 저장
        }

        int setSize = set.size();
        Integer[] integers = set.toArray(new Integer[setSize]);
        Arrays.sort(integers); // 비교 되어질 수 오름차순 정렬

        for (int num : nums) {
            int i = Arrays.asList(integers).indexOf(num);// indexOf 를 사용하기 위해 ArrayList로 변환
            sb.append(i).append(" "); // integers 를 오름차순 정렬 했기 때문에 i 는 곧 결과이다.
        }

        System.out.println(sb);
    }
}
