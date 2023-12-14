package pro1;

import java.util.Scanner;


public class Report1_5 {
	
	 public static void main(String[] args) {
			try (var stdIn = new Scanner (System. in)) {
				System. out.println("秒数を時間と分に直します");

				System. out. print(" 秒数: ") ;
				int x = stdIn.nextInt ();			
				System. out. println("時間 " +(x/3600));
				System. out. println("分  "+(x/60%60));
				System. out. println("秒"+(x%60));
			}
	
	 }	
	
}
