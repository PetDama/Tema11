
public class Client {

	public static void main(String[] args) {
		
		Joc joc1 = new Joc("Real Madrid: ", "Barcelona: ");
		Joc joc2 = new Joc ("Astra", "PSG");
		joc1.simuleaza();
		joc1.scor();
		System.out.println(joc1.printare());
	}

}
