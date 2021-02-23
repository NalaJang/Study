package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	   public static void main(String[] args) throws Exception{
		   
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   int num = Integer.parseInt(br.readLine());
		   
		   if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
			   System.out.println("1");
			   
		   } else {
			   System.out.println("0");
		   }
		   
		   br.close();
	   }
	}
