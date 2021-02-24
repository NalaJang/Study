package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	   public static void main(String[] args) throws Exception{
		   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  int x = Integer.parseInt(br.readLine());
		  int y = Integer.parseInt(br.readLine());
		  
		  if((0 < x && x <= 1000) && (0 < y && y <= 1000)) {
			  System.out.println("1");
			  
		  } else if((-1000 <= x && x < 0) && (0 < y &&  y <= 1000)) {
			  System.out.println("2");
			  
		  } else if((-1000 <= x && x < 0) && (-1000 <= y && y < 0)) {
			  System.out.println("3");
			  
		  } else if((0 < x && x <= 1000) && (-1000 <= y && y < 0)) {
			  System.out.println("4");
			  
		  }
	   }
	}
