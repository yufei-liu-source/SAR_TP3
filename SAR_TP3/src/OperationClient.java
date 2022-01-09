import java.rmi.Naming;

public class OperationClient {
	
	public static void main(String[] args) {
		try {
			CalculInterface c = (CalculInterface) Naming.lookup("rmi://192.168.43.135:1099/Calcul1");
			CompteurInterface cpt = (CompteurInterface) Naming.lookup("rmi://192.168.43.135:1099/Calcul1");
			System.out.println(c.somme(2, 4));
			System.out.println(cpt.nbOccurrences("s", "dsjkdjskdjskdjsk"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Client erreur :" + e);
		}
	}

}