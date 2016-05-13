import java.util.Scanner;

// Min element in the input

class MinInput {
	public static void main(String args[])
		throws java.io.IOException {
			int index, min;
			int array[] = new int[10]; 
			
			
			System.out.println("Please eneter 10 numbers.");
			
			// create Scanner object with param
			Scanner input = new Scanner(System.in); 
			
			for(index = 0; index <10; index++) 
				// call method nextInt of obj input of class Scanner				
				array[index] = input.nextInt();
			
			min = array[0];
			for(index = 1; index < 10; index++) 
				if(min > array[index]) 
					min = array[index];
			System.out.println("Minimum is " + min);
			
		}
}