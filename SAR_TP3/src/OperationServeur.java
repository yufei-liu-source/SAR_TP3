import java.rmi.Naming;

public class OperationServeur {
	public static void main(String[] args) {
		try {
			/*cree une instance de a class Operation
			 * et l'enregistre dans le serveur
			*/
			Naming.rebind("rmi://192.168.43.135:1099/Calcul1", new Operation());
			System.out.println("Publication methode de Calcul et Compteur");
			
			System.out.println("Serveur pret!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erreur serveur" + e);
		}
	}
	
}
