import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int stt = 0;
		int num2 = 0;
		int num = Integer.parseInt(st.nextToken());
		for(int i=0; i<7; i++) {
			num2 = Integer.parseInt(st.nextToken());
			if((stt == 1 && num > num2) || (stt == 2 && num < num2)) {
				stt = 3;
				break;
			}
			if(num < num2) {
				stt = 1;
			}
			if(num > num2) {
				stt = 2;
			}
			num = num2;
		}
		if(stt == 1) System.out.println("ascending");
		else if (stt == 2) System.out.println("descending");
		else System.out.println("mixed");
	}
}