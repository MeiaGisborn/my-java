/* 
	Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet 
	of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals 
	approximately 39.37 inches.)
	InchesToMeters.java
*/
class InchesToMeters {
	public static void main(String args[]) {
		double inch, meters;
		int counter;
		
		counter = 0;
		for (inch = 1; inch <= 144; inch++) { //144 inches in 12 feet
			meters = inch / 39.37; //convert inches to meters
			System.out.println(inch + " inches is " + meters + " meters.");
			
			counter++;
			//every 12th line is a blank line
			if(counter == 12) {
				System.out.println();
				counter = 0; //recet the line counter
			}
		}
	}
}
			
			
