/**
 * @(#)randomNumber.java
 *
 *
 * @author Ben Otte
 * @version 1.00 2013/2/16
 */

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	 public static void main(String[] args) {
    	Random generate = new Random();
    	Scanner userinput = new Scanner(System.in);
    	int guessAmount = 0;
    	int randomNumber = generate.nextInt(100)+1;
    	int guessNumber = userinput.nextInt();
    	while (guessNumber != randomNumber) {
    		
    		if (guessNumber < randomNumber) {
    			System.out.println("TOO LOW");
    			guessAmount=guessAmount+1;
    		}
    		else {
    			System.out.println("TOO HIGH");
    			guessAmount+=1;
    		}
   	}	
    		System.out.println("CORRECT! The number was " + randomNumber +". You guessed " + guessAmount + " times.");		
    }
    
    
}
