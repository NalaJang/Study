package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int newN = N;
		int count = 0;
		
		while(true) {
			int a = (N % 10) * 10;			   //십의 자릿수
			int b = ((N / 10) + (N % 10)) % 10;//일의 자릿수
			
			N = a + b;
			count++;
			
			if(newN == N) {
				System.out.println(count);
				break;
			}
		}
	}
}