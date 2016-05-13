/* Write a program that reads characters from the keyboard until a period is received. 
Have the program count the number of spaces. 
Report the total at the end of the program. */
class CharFromKeyboard {
	public static void main(String args[])
		throws java.io.IOException {
			char ch, ignore, stop = '.';
			int i_space = 0, i_total = 0;
			
			System.out.println("Enter some letters or numbers.");
					
			do {
				
				ch = (char) System.in.read(); // reading the entered character
				i_total = i_total + 1;
				// discard any other characters in the input buffer
				do {
					ignore = (char) System.in.read();
				} while(ignore != '\n');
				
				if(ch == stop) System.out.println("You have finished entering symbols.");
				else {
					if(ch == ' ') i_space = i_space + 1;
					
				}
			
			} while(ch != stop);
			System.out.println("Total number of entered symbols is: " + i_total);
			System.out.println("Total number of spaces is: " + i_space);
			
			
		}
}