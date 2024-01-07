

import java.io.*;
// N%5==0 이면 N/5 print
// 아니면 (N - (N/5)*5), (N - ((N/5)-1)*5), (N - ((N/5)-2)*5)
// 이렇게 몫이 큰 순서대로 최소몫까지 빼보면서 (결과값%3)==0 이면
// 결과값/3 을 카운트에 +해서 출력

// 이렇게 최소몫까지 비교했는데도 (결과값%3)!=0 이라면
// N%3==0 해보고
// 아니면 최종적으로 -1 출력

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        boolean isPossible = false;
        
        if (N % 5 == 0) {
            System.out.println(N / 5);
        } else {
            for (int i = N / 5; i > 0; i--) {
                int mod = N - i * 5;

                if (mod % 3 == 0) {
                    System.out.println(i + mod / 3);
                    isPossible = true;
                    break;
                }
            }

            if (!isPossible && N % 3 == 0) {
                System.out.println(N / 3);
                isPossible = true;
            }

            if (!isPossible) {
                System.out.println(-1);
            }
        }
    }
}