package baekjoon;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        int start=0;
        int end =0;
        int[] arr = new int[9];
        for(; start< end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }
}
