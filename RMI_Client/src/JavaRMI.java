import java.rmi.Remote;
import java.rmi.RemoteException;


public interface JavaRMI extends Remote {
	
	public String getTime()throws RemoteException;
	public String getVersion() throws RemoteException;
	public String getOS() throws RemoteException;
	

}
