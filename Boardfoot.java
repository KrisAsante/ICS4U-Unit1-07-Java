/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : April 2020
 * Created for : ICS4U
 * This program lets you input 2 parameters to calculate the height
 * 
 ****************************************************************************/

import java.util.Scanner;

public class Boardfoot {

	public static void main(String[] args) {
		
		double width,length;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the boardfoot. ");
		width = scanner.nextInt();
		System.out.println("Enter the length of the boardfoot. ");
		length = scanner.nextInt();
		
		Boardfoot(width,length);

	}
	
	public static void Boardfoot(double width,double length) {
		double height;
				
		height = (144 / width)/length;
		
		System.out.println("The height is " + height);
	}

}
