package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//첫번째 줄 input
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");//두번째 줄 input
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a < X) {
				sb.append(a).append(" ");
			}
		}
		System.out.println(sb);
		}
	}