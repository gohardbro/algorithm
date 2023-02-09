import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static List<Long> list = new ArrayList<>();
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        
        if (N < 11) {
            System.out.println(N);
        } else if (N > 1022) {
            System.out.println(-1);
        } else {
            for (int i=0; i<10; i++) {
                sol(i, 0);
            }
            
            Collections.sort(list);
            System.out.println(list.get(N));
        }
    }
    
    private static void sol(long num, int depth) {
        if (depth == 10) return;
        list.add(num);
        
        for (int i=0; i<num % 10; i++) {
            sol(num * 10 + i, depth + 1);
        }
    }
}