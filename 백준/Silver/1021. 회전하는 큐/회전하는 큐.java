import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 회전하는 큐
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 큐의 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수
        int cnt = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            linkedList.addLast(i+1);
        }

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수, num <= 1 <= n;
            int numIndex = linkedList.indexOf(num);// 해당숫자의 index
            double mid = (double) (linkedList.size() -1) / 2; // 현재 list 의 가운데 index

            if (numIndex <= mid) {
                for (int j = 0; j < numIndex; j++) {
                    linkedList.addLast(linkedList.pollFirst());
                    cnt++;
                }

            } else {
                int rightCnt = linkedList.size() - numIndex; // 오른쪽으로 이동시킬땐 뽑으려는숫자를 왼쪽 끝에서 뽑을수 있기 때문에 -1 하지 않는다.

                for (int k = 0; k < rightCnt; k++) {
                    linkedList.addFirst(linkedList.pollLast());
                    cnt++;
                }
            }

            linkedList.pollFirst();
        }

        System.out.println(cnt);
    }
}
