// Demonstrate the switch without break statements.
class NoBreak {
	public static void main(String args[]) {
		int i;
		
		for(i=0; i<=5; i++) {
			switch(i) {
				case 0:
					System.out.println("i is less than one");
				case 1:
					System.out.println("i is less than two");
				case 2:
					System.out.println("i is less than three");
				case 3:
					System.out.println("i is less than four");
				case 4:
					System.out.println("i is less than five");
			}
			System.out.println();
		}
	}
}

/*
D:\Private\Dropbox\Java>java NoBreak
i is less than one
i is less than two
i is less than three
i is less than four
i is less than five

i is less than two
i is less than three
i is less than four
i is less than five

i is less than three
i is less than four
i is less than five

i is less than four
i is less than five

i is less than five
*/
