import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Long> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        
        if (N <= 10) {
            System.out.println(N);
        } else {
            for (int i=0; i<=9; i++){
                addNum(i, 0);
            }

            if (N >= list.size()) System.out.println(-1);
            else {
                Collections.sort(list);
                System.out.println(list.get(N));
            }
        }
    }

    private static void addNum(long num, int depth) {
        if(depth == 10) return;
        list.add(num);

        for (int i=0; i<num%10; i++) {
            addNum(num*10+i, depth+1);
        }
    }   
}
