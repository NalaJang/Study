package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			
			if( i % 10 == 0 && i != 0) {
				bw.newLine();
			}
			
			bw.write(word.charAt(i));
			bw.flush();
		}
		bw.close();
		br.close();
	}
}