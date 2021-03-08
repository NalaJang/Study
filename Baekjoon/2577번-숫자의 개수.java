package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String result = String.valueOf(a * b * c);
		
		int[] arr = new int[10];
		
		for(int j = 0; j < result.length(); j++) {
			arr[result.charAt(j) - 48]++;
		}
		
		for(int i = 0; i < 10; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}
}