import java.rmi.*;
 
   public interface BaconListner extends Remote {
	   public int deposite(Bacon b) throws RemoteException;
   }