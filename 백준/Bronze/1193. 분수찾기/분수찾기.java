import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
 
		int crossCnt = 1, preCntSum = 0;
 
		while (true) {
			
			if (X <= preCntSum + crossCnt) {	
				if (crossCnt % 2 == 1) {
					System.out.print((crossCnt - (X - preCntSum - 1)) + "/" + (X - preCntSum));
					break;
				} else {
					System.out.print((X - preCntSum) + "/" + (crossCnt - (X - preCntSum - 1)));
					break;
				}
				
			} else {
				preCntSum += crossCnt;
				crossCnt++;
			}
		}
		
    }
}