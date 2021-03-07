package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int [9];
		int max = 0, index = 0;
		
		for(int i = 0; i < 9; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
			if(max < arr[i]) {
				max = arr[i];
				index = i + 1;
			}
		}
		sb.append(max).append("\n").append(index);
		System.out.println(sb);
	}
}