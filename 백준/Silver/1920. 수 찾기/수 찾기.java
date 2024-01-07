import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i=0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        int min = array[0];
        int max = array[N-1];

        final int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num>=min && num<=max) {
                if (Arrays.binarySearch(array, num)>=0) sb.append(1).append("\n");
                else sb.append(0).append("\n");

            } else sb.append(0).append("\n");
        }

        System.out.println(sb);
    }
}
