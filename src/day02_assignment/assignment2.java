package day02_assignment;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) {
			System.out.print("Please enter your grade(0~100): ");
			int score = sc.nextInt();
		if (90<= score){  
			System.out.print("Your grade is an A! (>‿*) ");
			}
			else if (80<= score ){
				System.out.print("Your grade is an B! (>*-*)");
			}
			else if (70<= score){
				System.out.print("Your grade is an C (*~*)");
			}
			else if (60<= score){
				System.out.print("Your grade is an D ('=.=)");
			}
			else  if (0<= score){
				System.out.print("Your grade is an F O.O");
			}
			else 
				System.out.print("Input error. Please enter between 0 to 100.");
			}

	}

}
