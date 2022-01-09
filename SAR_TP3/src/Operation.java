import java.rmi.RemoteException;

public class Operation extends java.rmi.server.UnicastRemoteObject implements CalculInterface, CompteurInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Operation() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int somme(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int nbOccurrences(String c, String mot) throws RemoteException {
		// TODO Auto-generated method stub
		int l = mot.length();
		int nb = 0;
		for (int i=0; i<l; i++){
			if ((mot.substring(i,i+1)).equals(c)) nb++;
		}
		return nb;
	}

}
