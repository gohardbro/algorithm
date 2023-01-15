import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            
    		String[] coordinate_1 = br.readLine().split(" ");	
	    	String[] coordinate_2 = br.readLine().split(" ");	
		    String[] coordinate_3 = br.readLine().split(" ");	
		
		    String x;
		    String y;
 
    		// x 좌표끼리 비교해서 쌍이 아닌 것 저장
	    	if (coordinate_1[0].equals(coordinate_2[0])) {	
		    	x = coordinate_3[0];
    		} else if (coordinate_1[0].equals(coordinate_3[0])) {
	    		x = coordinate_2[0];
	    	} else {
		    	x = coordinate_1[0];
		    }
 
    		// y 좌표끼리 비교해서 쌍이 아닌 것 저장
	    	if (coordinate_1[1].equals(coordinate_2[1])) {
		    	y = coordinate_3[1];
		    } else if (coordinate_1[1].equals(coordinate_3[1])) {
		    	y = coordinate_2[1];
		    } else {
			    y = coordinate_1[1];
		    }
		
		    System.out.println(x + " " + y);
	}
}