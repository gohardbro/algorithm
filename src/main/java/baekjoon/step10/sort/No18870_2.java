package baekjoon.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 좌표 압축
// + 최적화 (HashMap)
public class No18870_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[n];
        int[] sortedNums = new int[n];

        for (int i=0; i<n; i++) {
            sortedNums[i] = nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedNums); // 비교 되어질 수 오름차순 정렬

        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int key : sortedNums) {
            // sortedNums를 오름차순 정렬 했기 때문에 index는 곧 결과값이다.
            if (!map.containsKey(key)) { // 중복된 숫자 카운팅을 막기위해 key 키값이 존재하지 않을때만 카운팅 되게한다.
                map.put(key, index);
                index++;
            }
        }

        for (int num : nums) {
            sb.append(map.get(num)).append(" "); // 원래 입력한 순서의 배열을 키값으로 map에 value 를 불러온다.
        }

        System.out.println(sb);
    }
}
