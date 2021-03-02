package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int newN = N;
		int count = 0;
		
		do {
			int a = N;
			int b = N;
						
			if(N > 9) {
				a = N % 10;
				b = (N / 10) + (N % 10);
			}
			N = (a * 10) + (b % 10);
			count++;
		}
		while(newN != N);
		
		System.out.println(count);
	}
}