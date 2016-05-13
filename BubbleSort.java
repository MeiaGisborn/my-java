import java.util.Scanner;

// Min element in the input

class BubbleSort {
	public static void main(String args[])
		throws java.io.IOException {
			int index, temp_min, temp_max, t = 0;
			int array[] = new int[10]; 
			
			
			System.out.println("Please eneter 10 numbers.");
			
			// create Scanner object with param
			Scanner input = new Scanner(System.in); 
			
			for(index = 0; index <=10; index++) 
				// call method nextInt of obj input of class Scanner				
				array[index] = input.nextInt();
			
			for(index = 0; index <=10; index++) {
				temp_min = array[0];
				temp_max = array[1];
				if(temp_min > temp_min) {
					temp_min = t;
					temp_max = temp_min;
					temp_min = t;
					}
			}
			
			
			/* min = array[0];
			for(index = 1; index < 10; index++) 
				if(min > array[index]) 
					min = array[index]; */
			System.out.println(array[10]);
			
		}
}