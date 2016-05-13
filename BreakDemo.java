// Using break to exit the loop.
class BreakDemo {
	public static void main(String args[]) {
		int num;
		
		num = 1000;
		
		// loop while i-squared is less than num
		for(int i=0; i < num; i++) {
			if(i*i >= num) break; 
			// terminate loop if i*i >= 100
			System.out.println(i + " ");
		}
		System.out.println("Loop complete.");
	}
}
