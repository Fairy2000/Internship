package internship;

import java.util.Scanner;



public class Rock_paper_scissors_game {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Welcome to Rock Paper Scissors Game");
		System.out.print("Please Enter your Name: ");
		String name = in.nextLine();
		System.out.println("Hello "+name+"! ");
		
		while(true) {
		
		System.out.print("Enter your move.\n Options are:-\n 1.Rock\n 2.Paper\n 3.Scissors\n If you want to exit the game, type quit\n");
		String mymove = in.nextLine();
		
		
		if(mymove.equals("quit")) 
		{
			break;
		}
		
		
		if( !mymove.equals("Rock") && !mymove.equals("Paper") && !mymove.equals("Scissors"))
		{
		System.out.println("Invalid Input");
		}
		
		else
		{
		int rand = (int)(Math.random() * 3);
		String opponentmove = "";
		if(rand==0)
		{
			opponentmove = "Rock";
		}
		else if(rand==1)
		{
			opponentmove = "Paper";
		}
		else
		{
			opponentmove = "Scissors";
		}
		System.out.println("Opponent Move:"+ opponentmove);
		
		
		if(mymove.equals(opponentmove))
		{
	    System.out.println("You tied !");	
		}
		
		else if(mymove.equals("Rock") && opponentmove.equals("Scissors") || mymove.equals("Scissors") && opponentmove.equals("Paper")
				|| mymove.equals("Paper") && opponentmove.equals("Rock"))
		{
		System.out.println("You won !");		
		}
		else
		{
		System.out.println("You lost !");	
		}
		
		} 
		
		
		}
		
		System.out.println("Thanks for playing !");	 
		in.close(); 
	}

}
