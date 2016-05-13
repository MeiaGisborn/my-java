// Try this 2-2: a truth table for the logical operators.
class LogicalOpTable {
	public static void main(String args[]) {
		boolean p, q;
		
		p = true; q = true; 
		System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
		System.out.print((p&q ? 1 : 0) + "\t" + (p|q ? 1 : 0) + "\t");
		System.out.println((p^q ? 1 : 0) + "\t" + (!p ? 1 : 0));
		
		p = true; q = false;
		System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
		System.out.print((p&q ? 1 : 0) + "\t" + (p|q ? 1 : 0) + "\t");
		System.out.println((p^q ? 1 : 0) + "\t" + (!p ? 1 : 0));
		
		p = false; q = true;
		System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
		System.out.print((p&q ? 1 : 0) + "\t" + (p|q ? 1 : 0) + "\t");
		System.out.println((p^q ? 1 : 0) + "\t" + (!p ? 1 : 0));
		
		p = false; q = false;
		System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
		System.out.print((p&q ? 1 : 0) + "\t" + (p|q ? 1 : 0) + "\t");
		System.out.println((p^q ? 1 : 0) + "\t" + (!p ? 1 : 0));
		
		/* System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)); */
		/* System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)); */
		/* System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)); */
		/* System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)); */
		
	}
}
