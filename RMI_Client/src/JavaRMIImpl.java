import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class JavaRMIImpl extends UnicastRemoteObject implements JavaRMI{

	protected JavaRMIImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getTime() throws RemoteException {
		
		return "time";
	}

	@Override
	public String getVersion() throws RemoteException {
		
		return "version";
	}

	@Override
	public String getOS() throws RemoteException {
		
		return "Windows";
	}

}
