import java.io.*;
public class Main {
    private static int N;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        sol("");
    }
    
    private static void sol(String str) {
        // 종료조건
        if (str.length() == N) {
            System.out.println(str);
            System.exit(0);
        }
        
        // logic
        for (int i=1; i<=3; i++)
            if (isPossible(str + i)) sol(str + i);
    }
    
    private static boolean isPossible(String str) {
        for(int i=1; i<=str.length()/2; i++) {
            String left = str.substring(str.length() - i * 2, str.length() - i);
            String right = str.substring(str.length() - i);
            if(left.equals(right)) return false;
        }
        return true;
        
    }
}