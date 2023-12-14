package pro1;
import java.util.Scanner;


public class Report1_3 {

	
	
	 public static void main(String[] args) {
			try (var stdIn = new Scanner (System. in)) {
				System. out.println("各図形の面積を求めます");

				System. out. print(" 底辺（下底）: ") ;
				double x = stdIn.nextDouble ();
				System. out. print (" 高さ: ");
				double y = stdIn. nextDouble ();
				System. out. print (" 上底: ");
				double z = stdIn. nextDouble ();
				System. out. print (" 半径: ");
				double r = stdIn. nextDouble ();
				System. out. println("三角形の面積 " +(x*y/2));
				System. out. println("四角形の面積 "+(x*y));
				System. out. println("台形の面積"+((x+z)*y/2));
				double pi= 3.14;
				System. out. println("円の面積 " +(pi*r*r));
			}
			
			
	
	
	 }	
	
}
