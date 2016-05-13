// Guess the letter game.
class MyGame {
	public static void main(String args[])
		throws java.io.IOException {
		
		char ch, answer = 8;
		
		System.out.println("I'm thinking of a number between 1 and 10.");
		System.out.print("Can you guess it? ");
		
		ch = (char) System.in.read(); // read a char from the keyboard
		for(answer=0; answer<=10; answer++){
			if(answer==1)
				System.out.println("Cold");
			else if(answer==2)
				System.out.println("Cold, try a bigger number");
			else if(answer==3)
				System.out.println("Try a bigger number");
			else if(answer==4)
				System.out.println("A little warmer");
			else if(answer==5)
				System.out.println("Warm");
			else if(answer==6)
				System.out.println("Too warm");
			else if(answer==7)
				System.out.println("Hot");
			else if(answer==9)
				System.out.println("Try a lesser number");
			else if(answer==10)
				System.out.println("Try a lesser number");
			else
				System.out.println("Please read once more the game rules.");
		}
		
		
		if(ch == answer) System.out.println("**Right**");
		else {
			System.out.print("...Sorry, you're ");
			// a nested if
			if(ch < answer) System.out.println("too low");
			else System.out.println("too high");
		}
	}
}
