/* 
	The moon's gravity is about 17 percent of the earth's.
	
	Write a program that computes your effective weights on the moon.
	
	MoonWeight.java.
*/
class MoonWeight {
	public static void main (String args[]) {
		double earth_w, moon_w;
		earth_w = 60;
		moon_w = earth_w * 0.17;
		System.out.println(earth_w + " kg on the Earth is " + moon_w + " kg on the Moon");
	}
}
