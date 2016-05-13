// Guess game with letters from a to z
class GuessNumberGame 
{
	public static void main(String args[])
		throws java.io.IOException {
			char answer = 's';
			char ch;
			
			System.out.println("I'm thinking of a letter between a to z.");
			System.out.println("Can you guess it?");
			
			ch = (char) System.in.read(); // get a char
			
			
			// Break as a goto
			for( ; ch != answer;  ) {
				one: {
					two: {
						three: {
							four: {
								five: {
									six: {
										if((ch>='a') && (ch<='g')) break one;
										if((ch>='h') && (ch<='n')) break two;
										if((ch>='o') && (ch<='r')) break three;
										if((ch>='t') && (ch<='w')) break four;
										if((ch>='x') && (ch<='z')) break five;
										if(ch >= '0') break six;
									}
									System.out.println("Please read carefully game rules.");
								}
								System.out.println("Cold. Try higher.");					
							}
							System.out.println("Try lower.");
						}
						System.out.println("Warm, try once more");
					}
					System.out.println("A little warmer. Try once more.");	
				}
				System.out.println("Freezing cold. Try higher.");
			}
			if(ch == answer) System.out.println("You're right!!!");
		}
}
			
						
			
			
			
			
			// The do while loop
			/* char ignore;
			do 
			{ 
				System.out.println("I'm thinking of a letter between a to z.");
				System.out.println("Can you guess it?");
				
				ch = (char) System.in.read(); //read the entered character
				
				// discard any other characters which are not letters
				do 
				{
					ignore = (char) System.in.read();
				} while(ignore != '\n');
				
				if(ch == answer) System.out.println("Right!");
				else 
				{
					System.out.print("Sorry, ");
					if((ch >= 'a') && (ch <= 'g')) System.out.println("you're too low");
					if((ch >= 'h') && (ch <= 'n')) System.out.println(" try warmer");
					if((ch >= 'o') && (ch <= 'r')) System.out.println("hot! Try once more");
					if((ch >= 't') && (ch <= 'w')) System.out.println("warmarm, try a preceeding letter.");
					if((ch >= 'x') && (ch <= 'z')) System.out.println("too cold, try lower."); 
				}
			} while(ch != answer);
		}
}
*/			
			
			
			
			
			// With While loop
			// while(ch != answer) {
				
			// } 			
			
			
			
			
				
			
			
			// With the For loop
			/*
			char user;
			
			user  = (char) System.in.read();
			
			System.out.println("You have entered the letter: " + user);
			System.out.println("The preceeding letters will be: ");
			
			for(ch = 'a'; ch < user; ch++ ) {
				System.out.print(ch + " ");
			}
			*/			
			
			// Nested switch statements with break
			/* switch(ch) {
				case 'a':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("This is a wrong answer. Try higher.");
				break;
				case 'b':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("This is a wrong answer. Try higher.");
				break;
				case 'c':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("This is a wrong answer. Try higher.");
				break;
				case 'd':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("This is a wrong answer. Try higher.");	
				break;
				case 'e':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("This is a wrong answer. Try higher.");
				break;
				case 'f':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("A little warmer. Try higher.");	
				break;
				case 'g':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("A little warmer. Try higher.");	
				break;
				case 'h':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("A little warmer. Try higher.");	
				break;
				case 'i':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("A little warmer. Try higher.");	
				break;
				case 'j':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("A little warmer. Try higher.");	
				break;
				case 'k':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warmer. Try higher.");	
				break;
				case 'l':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warmer. Try higher.");	
				break;
				case 'm':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warmer. Try higher.");	
				break;
				case 'n':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warmer. Try higher.");	
				break;
				case 'o':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warmer. Try higher.");	
				break;
				case 'p':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Hot. You're close to the right choise");	
				break;
				case 'q':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Hot. You're close to the right choise");	
				break;
				case 'r':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Hot. You're close to the right choise");	
				break;
				case 's':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("**Right!!!**");
				break;
				case 't':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Hot. You're close to the right choise");
				break;
				case 'u':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Hot. You're close to the right choise");
				break;
				case 'v':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Hot. You're close to the right choise");
				break;
				case 'w':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warm, but too low.");
				break;
				case 'x':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warm, but too low.");
				break;
				case 'y':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warm, but too low.");
				break;
				case 'z':
					System.out.println("You have chosen a letter: " + ch);
					System.out.println("Warm, but too low.");
				break;
			}
			*/
				
			
			// Some variants on the For loop
					
			// ___Nested if block____ 
			/* if(ch == answer) System.out.println("You're correct!");
			else {
				if((ch >= 'a') && (ch <= 'g')) System.out.println("Sorry, you're too low");
				if((ch >= 'h') && (ch <= 'n')) System.out.println("Getting warmer");
				if((ch >= 'o') && (ch <= 'r')) System.out.println("Hot! Try once more");
				if((ch >= 't') && (ch <= 'w')) System.out.println("Warm, try a preceeding letter.");
				if((ch >= 'x') && (ch <= 'z')) System.out.println("Too cold, try lower."); 
				if(ch >= 0) System.out.println("Read the rules once more!"); 
			}
			*/
			
			// ___If-else-if ladder___
			/* if(ch == 's')
				System.out.println("**Correct!**");
			else if(ch == 'a')
				System.out.println("Very-very cold! Try once more!");
			else if(ch == 'b')
				System.out.println("Very-very cold! Try once more!");
			else if(ch == 'c')
				System.out.println("Very-very cold! Try once more!");
			else if(ch == 'd')
				System.out.println("Very-very cold! Try once more!");
			else if(ch == 'e')
				System.out.println("Cold. Try higher letter :)");
			else if(ch == 'f')
				System.out.println("Cold. Try higher letter :)");
			else if(ch == 'g')
				System.out.println("Cold. Try higher letter :)");
			else if(ch == 'h')
				System.out.println("Cold. Try higher letter :)");
			else if(ch == 'i')
				System.out.println("Cold. Try higher letter :)");
			else if(ch == 'j')
				System.out.println("Cold. Try higher letter :)");
			else if(ch == 'k')
				System.out.println("Warm. Try higher.");
			else if(ch == 'l')
				System.out.println("Warm. Try higher.");
			else if(ch == 'm')
				System.out.println("Warm. Try higher.");
			else if(ch == 'n')
				System.out.println("Warm. Try higher.");
			else if(ch == 'o')
				System.out.println("Warm. Try higher.");
			else if(ch == 'p')
				System.out.println("Hot! You're near!");
			else if(ch == 'q')
				System.out.println("Hot! You're near!");
			else if(ch == 'r')
				System.out.println("Hot! You're near!");
			else if(ch == 't')
				System.out.println("Hot! You're near!");
			else if(ch == 'u')
				System.out.println("Warm, but try lower.");
			else if(ch == 'v')
				System.out.println("Warm, but try lower.");
			else if(ch == 'w')
				System.out.println("Warm, but try lower.");
			else if(ch == 'x')
				System.out.println("Warm, but try lower.");
			else if(ch == 'y')
				System.out.println("Cold. Try lower.");
			else if(ch == 'z')
				System.out.println("Cold. Try lower.");
			else 
				System.out.println("Please, read carefully the game rules."); */
			
		//}
//}

			
			

/*
 Scanner sc = new Scanner(System.in);
 int i = sc.nextInt();
 */