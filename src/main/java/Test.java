import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 반례) 숫자의 조합이 순서가 있기때문에 만약 num = 3618, z = 2 라면
 * 숫자의 조합이 81이 될수 없다.
 * 가장 큰수는 68 이다.
 *
 * 그렇기 때문에 위경우 num=3618 에서 두개의 숫자 조합중 가장 큰것을 고르려면
 * 1. 3618 을 "361"8 같이 구분해서
 * 2. 왼쪽문자열 "361" 문자 3,6,1중 가장큰 숫자를 고르면 6 이다. 이걸 StringBuilder에 append한다. 현재 "6"
 * 3. 6을 골랐으니 6포함 왼쪽에 있는 숫자는 탐색할필요가 없으니 버리면 "18"이 남는다.
 * 4. 1개를 이미 골랐으니 남은건 문자열 "18"에서 한개만 고르면 된다. 그려면 "8"이다. append 한다. 현재 "68"
 * 결과는 68
 * 이런식으로 구현해야한다.
  */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        System.out.println(sol(split[0], Integer.parseInt(split[1])));

    }

    private static StringBuilder sol(String num, int z) {
        int startIndex = 0; // 탐색 시작 index
        int max = 0; // 현재 가장 큰수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length() - z; i++) { // num.length() - z = 구하려는 숫자의 문자개수
            max = 0;

            for (int j = startIndex; j <= i + z; j++) { // i+z = 마지막 탐색해야하는 index
                if (max < num.charAt(j) - '0') {
                    max = num.charAt(j) - '0';
                    startIndex = j + 1; // 맨위 설명의 3번에 해당한다.(고른숫자index+1 = 다음 탐색해야할 첫번째 요소)
                }
            }

            sb.append(max);
        }

        return sb;
    }
}
