package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int i = Integer.parseInt(st.nextToken());
			
			if(min > i) {
				min = i;
			}
			
			if(max < i) {
				max = i;
			}
		}
		
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	}
}