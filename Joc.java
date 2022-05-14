
public class Joc {
	private String numeEchipa1;
	private String numeEchipa2;
	public Minge minge = new Minge(50, 25);
	
	private int numarGoluri1;
	private int numarGoluri2;
	private int numarCorner;
	private int numarOuturi;
	
	public Joc(String numeEchipa1, String numeEchipa2) {
		this.numeEchipa1 = numeEchipa1;
		this.numeEchipa2 = numeEchipa2;
	
	}
	
	public String printare() {
		String s = numeEchipa1 + " " + numarGoluri1 +
				"\n" + numeEchipa2 + " " +  numarGoluri2 +
				"\n" + "Cornere = " + numarCorner + 
				"\n" + "Outuri = " + numarOuturi;
		return s;
	}
	
	public void simuleaza() {
		//for (start, stop, step)
		for (int i=0; i<1000; i++) {
			minge.suteaza();
			System.out.println(numeEchipa1 + " - "
			+ numeEchipa2 + ": " + "Mingea se afla la coordonatele "
					+ minge.getX() + "," + minge.getY());
		}
	}
	
	public void scor() {
		this.numarGoluri1 = Gol.getContor1();
		this.numarGoluri2 = Gol.getContor2();
		this.numarCorner = Corner.getContor();
		this.numarOuturi = Out.getContor();
	}
}
