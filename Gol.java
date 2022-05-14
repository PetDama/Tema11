
public class Gol extends Exception{
	
	static int contor1 = 0;
	static int contor2 = 0;
	
	public Gol(int n) {
		if(n == 1)
			contor1++;
		else 
			contor2++;
	}

	public static int getContor1() {
		return contor1;
	}
	public static int getContor2() {
		return contor2;
	}

	

}
