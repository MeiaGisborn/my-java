/*
Try this 1-2
This program displays a conversion 
table of inches to meters.
Call this program "GalToLitTable.java".
*/

class InchToMeters {
	public static void main(String args[]) {
		double inches, meters;
		int counter;
		
		counter=0;
		for(inches=1; inches<=100; inches++) {
			meters=inches/39.37; // convert to meters
			System.out.println(inches+" inches are " + meters + " meters.");
			
			counter++;
			//every 10th line, print a blank line
			if(counter==12) {
				System.out.println();
				counter=0; //reset the line counter
			}
		}
	}
}
