package pro1;

import java.util.Scanner;


public class Report1_4 {

	
	
	 public static void main(String[] args) {
			try (var stdIn = new Scanner (System. in)) {
				System. out.println("xとyを加減乗除します。");

				System. out. print(" xの値: ") ;
				double x = stdIn.nextDouble ();
				System. out. print (" yの値: ");
				double y = stdIn. nextDouble ();
				System. out. println("x + y = " +(x+y));
				System. out. println("x – y = "+(x-y));
				System. out. println("x * y  ="+(x*y));
				System. out. println("x / y  = " +(x/y));
				System. out.println("x % y ="+( x % y));
			}
			
			
	
	
	 }	
	
}
