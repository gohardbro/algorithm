package baekjoon.steps.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 통계학
public class No2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int cntMax = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            map.putIfAbsent(nums[i], 0);
            map.put(nums[i], map.get(nums[i])+1);

            if (map.get(nums[i]) > cntMax)
                cntMax = map.get(nums[i]);
        }

        int mapSize = map.size();
        Integer[] keys = map.keySet().toArray(new Integer[mapSize]);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int key : keys) {
            if (map.get(key) == cntMax)
                arrayList.add(key);
        }

        int arraySize = arrayList.size();
        Integer[] integers = arrayList.toArray(new Integer[arraySize]);

        int thirdLineResult = 0;
        if (arrayList.size() < 2) {
            thirdLineResult = integers[0];
        } else {
            Arrays.sort(integers);
            thirdLineResult = integers[1];
        }

        sb.append(calAverage(nums)).append("\n")
                .append(calMidNum(nums)).append("\n")
                .append(thirdLineResult).append("\n")
                .append(calMinMaxGap(nums));
        System.out.println(sb);

    }

    // 산술평균
    private static int calAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        double average = (double) sum/nums.length;

        return (int) Math.round(average);
    }

    // 중앙값
    private static int calMidNum(int[] nums) {
        Arrays.sort(nums);
        int midIndex = 0;

        if (nums.length > 1)
            midIndex = (nums.length-1)/2;

        return nums[midIndex];
    }

    // 범위
    private static int calMinMaxGap(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1] - nums[0];
    }
}
