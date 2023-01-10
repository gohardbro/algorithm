import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 길이 재기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length());
    }
}
