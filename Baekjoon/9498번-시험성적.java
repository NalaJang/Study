package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	   public static void main(String[] args) throws Exception{
		   
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   int num = Integer.parseInt(br.readLine());
		   
		   if(90 <= num && num <= 100) {
			   System.out.println("A");
			   
		   } else if(80 <= num && num <= 89) {
			   System.out.println("B");
			   
		   } else if(70 <= num && num <= 79) {
			   System.out.println("C");
			   
		   } else if(60 <= num && num <= 69) {
			   System.out.println("D");
			   
		   } else {
			   System.out.println("F");
		   }
		   
		   br.close();
//		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		   
//		   String[] split = br.readLine().split(" ");
//		   
//		   int a = Integer.parseInt(split[0]);
//		   int b = Integer.parseInt(split[1]);
//		   
//		   String str = "";
//		   
//		   if(a == b) {
//			   str = "==";
//		   } else {
//			   str = (a > b) ? ">" : "<";
//			   
//		   }
//		   System.out.println(str);
		   
	   }
	}
