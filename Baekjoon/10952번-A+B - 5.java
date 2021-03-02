package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static int A, B;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			String str = br.readLine();
			A = str.charAt(0) - 48;
			B = str.charAt(2) - 48;
			
			if(A == 0 && B == 0) {
				break;
			}
			sb.append(A + B).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}