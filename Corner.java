
public class Corner extends Exception{
	
	static int contor = 0;

	public Corner() {
		contor++;
	}

	public static int getContor() {
		return contor;
	}

	public void setContor(int contor) {
		this.contor = contor;
	}
}
