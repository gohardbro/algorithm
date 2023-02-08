import java.io.*;
import java.util.*;

public class Main {
    private static int N; // N번째 감소하는 수
    private static List<Long> list = new ArrayList<>(); // 조합 저장
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        
        if (N <= 10) {
            System.out.println(N);
        } else if (N > 1022) {
            System.out.println(-1);
        } else {
            for (int i=0; i<10; i++) {
                sol(i, 1);
            }
            
            // 숫자조합을 순서 관계없이 저장했으니 N번째를 구하려면 오름차순 정렬 해야한다.
            Collections.sort(list);  
            System.out.println(list.get(N));
        }
    }
    
    private static void sol(long num, int depth) {
        // 9876543210 총 10자리가 마지막 
        if (depth > 10) return;
        
        list.add(num);
        
        for (int i=0; i<num % 10; i++) {
            sol((num * 10) + i, depth + 1);
        }
    }
}