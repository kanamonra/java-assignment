package day02_assignment;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner ts = new Scanner(System.in) ;
			
			String depart = null ;
			String name = null ;  
			int english = 0  ;
			int physics = 0  ;
			int microbio = 0  ;
			String address = null ;
			
			
			System.out.print ("Please enter your name: ");
			name = ts.next();
			ts.nextLine();			
			
			System.out.print("Please enter your department: ");
			depart = ts.nextLine();                                              
						
			System.out.print("Please enter your English class score: ");
			english = ts.nextInt();                                                            
			System.out.print("Please enter your Physics class score: ");
			physics = ts.nextInt();
			System.out.print("Please enter your Micro biological class score: ");
			microbio = ts.nextInt();
			
			ts.nextLine();
			System.out.print("Please enter your home address: ");
			address = ts.nextLine(); 
			
			System.out.println("Please check your information.");
			System.out.printf("Name = %s\n" , name);
			System.out.printf("Department = %s\n" , depart);
			System.out.printf("Score details: "
					+ "English = %d,\n"  + "Physics = %d,\n" + "Microbiological = %d,\n" , english, physics, microbio );
			System.out.printf("Address = %s\n" , address + ",");
		
			
			


			}


	}


