import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int res = 0;
		int bns = 0;
		for(int i=0; i<num; i++) {
			char score = str.charAt(i);
			if(score == 'O') { res += i+1+bns; bns++;}
			else if(score == 'X') bns = 0;
		}
		System.out.println(res);
	}
}