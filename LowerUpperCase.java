/*
The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert 
a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program 
that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, 
and all uppercase letters to lowercase, displaying the result. Make no changes to any other 
character. Have the program stop when the user enters a period. At the end, have the program 
display the number of case changes that have taken place.
*/
class LowerUpperCase {
	public static void main(String args[])
		throws java.io.IOException {
			char ch, ch_low, ch_upper;
			int i = 0;
			
			System.out.println("Please input a letter");
			
			
			do {
			
				ch = (char) System.in.read(); // reading entered letter
				
				if((ch >= 'a') & (ch <= 'z')) {
					// ch_low = ch;
					ch = (char)(ch-32);
					i++;
					System.out.println(ch);
				} else
				if((ch >= 'A') & (ch <= 'Z')) {
					//ch_upper = ch;
					ch = (char) (ch+32);
					i++;
					System.out.println(ch);
				}

				
			} while(ch != '.');
			
			System.out.println("You have finished entering");
			System.out.println("Trancations were performed " + i + " times");
			
		}
}