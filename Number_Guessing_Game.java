package internship;

import java.util.Scanner;
import java.lang.Math;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		
		    
		    int answer = (int)(Math.random() * 100) + 1;
		    
		    Scanner input = new Scanner(System.in);
		  
		    System.out.println("Welcome to Number Guessing Game");
			System.out.print("Please Enter your Name: ");
			String name = input.nextLine();
			System.out.println("Hello "+name+"! "+"you have to guess the number in five tries. All The Best!");
			
			int k = 5;
		    while (k > 0) {
		      System.out.println("Enter your guess: ");
		     int guess = input.nextInt();
		      
		     if (guess == answer)
		      {
		    	 
		        System.out.println("You guessed the number!\nYou win!");
		        break;
		      }
		      
		      else if (guess > answer) 
		      {
		    	  if(k>1)
		    	  {
		           System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");
		    	  }
		    	  else
		    	  {
		           System.out.println("You have "+(k - 1) + " tries left.");
		    	  }
		      }
		     
		      else 
		      {

		    	  if(k>1)
		    	  {
		           System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
		    	  }
		    	  else
		    	  {
		           System.out.println("You have "+(k - 1) + " tries left.");
		    	  }
		      }
		    
		      k--;
		    }
		    
		    if (k==0) 
		    {
		    	System.out.println("You lose! Better luck next time.");
		    }
		    
		    input.close();
	}


}


