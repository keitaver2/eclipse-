package pro1;

import java.util.Scanner;


public class Report2_2 {
	
	 public static void main(String[] args) {
			try (var stdIn = new Scanner (System. in)) {
				System. out.println("入力された西暦年が閏年か判別します");
				System. out.println("西暦年を入力してください");

				System. out. print(" 西暦年: ") ;
				int x = stdIn.nextInt ();	
			  if(x>=0) {
				if (x%4==0) {
			     if(x%100==0) {
				   if(x%400==0) {   
					   
					  System. out. println("閏年である");
				  }else 
					  System. out. println("閏年でない");
				  }else 
					  System. out. println("閏年である");
				  }else 
					  System. out. println("閏年でない");
			  }else
				  System. out. println("西暦年が正の値でない");
			     }
			 
			
		
				
	
	 }	
	
}