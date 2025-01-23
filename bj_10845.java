import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> nums = new ArrayList();
		int r = 0;
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			switch(str.charAt(1)) {
			case 'u':
				int unum = Integer.parseInt(str.substring(5));
				q.add(unum);
				r = unum;
				break;
			case 'o':
				Integer pnum = q.poll();
				if(pnum != null) nums.add(pnum);
				else nums.add(-1);
				break;
			case 'i':
				nums.add(q.size());
				break;
			case 'm':
				if(q.isEmpty()) nums.add(1);
				else nums.add(0);
				break;
			case 'r':
				if(q.isEmpty()) nums.add(-1);
				else nums.add(q.peek());
				break;
			case 'a':
				if(q.isEmpty()) nums.add(-1);
				else nums.add(r);
				break;
			}
		}
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	} 
}