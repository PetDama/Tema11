
public class Out extends Exception{
	
	static int contor = 0;
	
	public Out() {
		contor++;
		
	}

	public static int getContor() {
		return contor;
	}

	public void setContor(int contor) {
		this.contor = contor;
	}
	
}
