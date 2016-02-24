/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottebdrum
 */
import java.util.Scanner;
public class ModifyAnArray {
	public static void main(String args[]) {
		long [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Please select an option");
		System.out.println("0 - Initalize array");
		System.out.println("1- square");
		System.out.println("2 - reverse");
		System.out.println("3- accumulate");
		System.out.println("4 - halve");
		System.out.println("or any other integer to Quit.");
                } while (false);
		
		
		if (choice ==0){ System.out.println( numbers ); }
				
                else if (choice == 1) { square(numbers); }
				
                else if (choice == 2) { reverse(numbers); }
				
                else if (choice == 3) {accumulate(numbers); }
				
                else if (choice == 4) { halve(numbers); }
				
                else { System.out.println("Quitting....");
                        choice == true;}
                // end if else statements
                int choice = input.nextInt();		 		
} //end main

// opt 1
public static void square(long [] L) {
    for (int i =0; i < L.length; i++) {
		 L[i]=L[i] ** 2 ;
		} // end for loop
    return L;
	} // end square function

//opt 2
public static void reverse(long [] L) {
	for (int x=0; x <L.length/2); x++) {
		int temp = L[x];
		L[x] = L[L.length-x-1];
		L[L.length-x-1] = temp;
		}// end for loop
		return L;
	}// end reverse function

// opt 3
public static void accumulate(long [] L) {
	for (pos = 0, pos <= L.length; x++) {
			L[pos] = L[pos] + L[pos - 1]			
		}// end for loop
		return L;		
	} // end accumulate

// opt 4
public static void halve(long [] L);
	for (i = 0; i < L.length; pos++) {
		L[pos] = (L[pos] / 2)
	}// end for loop		
	return L;


} // end program

