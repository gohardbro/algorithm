import java.io.*;
import java.util.StringTokenizer;

// StringTokenizer 로 입력받은 문자열을 공백단위로 분리 후
// 하나씩 parseInt하면서 1부터 자기자신까지 숫자로 나눠보면서
// 1이거나 자기자신 외에 나머지가 0이면 소수가 아니기때문에 제외
// 반대이면 소수로 간주 cnt++ 함

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean isPNum = false;
            
            if (num==1) continue;
            if (num==2) cnt++;
            
            // 1과 자기자신 제외 비교
            for (int j=2; j<num; j++) {
                if (num%j==0) {
                    isPNum = false;
                    break;
                }
                
                isPNum = true;
            }
            
            if (isPNum) cnt++;
        }
        
        System.out.println(cnt);
    }
}