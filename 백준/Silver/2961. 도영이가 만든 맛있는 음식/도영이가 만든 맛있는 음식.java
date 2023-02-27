import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[] S;
    private static int[] B;
    private static int min = Integer.MAX_VALUE;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        S = new int[N];
        B = new int[N];
        
        for (int i=0; i<N; i++) {
            String[] str = br.readLine().split(" ");
            S[i] = Integer.parseInt(str[0]); // 신맛 저장
            B[i] = Integer.parseInt(str[1]); // 쓴맛 저장
        }
        
        sol(1, 0, 0, 0);
        
        System.out.println(min);
    }
    
    private static void sol(int sour, int bitter, int index, int depth) {
        if (depth >= 1) { 
            min = Math.min(Math.abs(sour - bitter), min);
        }
        
        for (int i=index; i<N; i++) {
            sol(sour * S[i], bitter + B[i], i+1, depth+1);
        }
    }
}