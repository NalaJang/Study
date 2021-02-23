package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	   public static void main(String[] args) throws Exception{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   String[] split = br.readLine().split(" ");
		   
		   int a = Integer.parseInt(split[0]);
		   int b = Integer.parseInt(split[1]);
		   
		   String str = "";
		   
		   if(a == b) {
			   str = "==";
		   } else {
			   str = (a > b) ? ">" : "<";
			   
		   }
		   System.out.println(str);
	   }
	}
