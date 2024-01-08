import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(gcd(Math.max(a, b), Math.min(a, b)));
        System.out.println(lcm(a, b));
    }
    
    // 최대공약수
    private static int gcd(int a, int b) {
        // a>=b>=0
        if (b==0) return a;
        return gcd(b, a%b);
    }
    
    // 최소공배수
    private static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }
}