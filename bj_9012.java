import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] strs = new String[num];
		for(int i=0; i<num; i++) {
			strs[i] = br.readLine();
		}
		for(int i=0; i<num; i++) {
			Boolean isNo = false;
			Stack<Character> stack = new Stack<>();
			String str = strs[i];
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j); 
				if(c == '(') stack.push(c);
				else {
					if(stack.isEmpty()) {
						System.out.println("NO");
						isNo = true;
						break;
					}
					else stack.pop();
				}
			}
			if(!isNo) {
				if(stack.isEmpty()) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
}