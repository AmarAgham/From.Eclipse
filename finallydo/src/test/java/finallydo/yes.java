package finallydo;

import java.util.Scanner;

public class yes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();
		
		if (cash < 10) {
			System.out.println("you want more cash");
		}
		
			else if (cash > 10 && cash < 50) {
			 System.out.println("you get only pen");
			}
		
			 else {
				 System.out.println("You both");
			 }
			 }
		

             

	}


