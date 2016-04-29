import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface BeaconListener extends Remote {
	
	public int deposit(Beacon b) throws RemoteException, NotBoundException;
}
