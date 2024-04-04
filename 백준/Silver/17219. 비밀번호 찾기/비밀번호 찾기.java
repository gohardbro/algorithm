// Map을 이용하여 해보자
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmStrs = br.readLine().split(" ");
        final int N = Integer.parseInt(nmStrs[0]);
        final int M = Integer.parseInt(nmStrs[1]);
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        // 주소, 비번 입력값 저장
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            map.put(inputs[0], inputs[1]);
        }
        
        // 입력한 주소의 비번출력
        for (int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }
        
        System.out.println(sb);
    }
}