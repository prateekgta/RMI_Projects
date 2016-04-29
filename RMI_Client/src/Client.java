import java.rmi.Naming;
import java.rmi.RMISecurityManager;




public class Client {

	private static final String URL ="//localhost:1099/clientObject";
	
	JavaRMIImpl clientObject;
	
	static 
	{
		System.loadLibrary("Client");
	}
	
	public native String getTime();
	public native String getVersion();
	public native String getOS();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			try {
				Client c=new Client();
				System.out.println(c.getOS());
				
			} 
			catch(Exception e) {	
				e.printStackTrace();
			}
		
	}
	
	public  void registerObject()
	{
		
		
		try {
				if (System.getSecurityManager() == null) 
				{
				System.out.println("Setting Security manager");
				System.setSecurityManager(new RMISecurityManager());			  
				}
				System.setProperty("java.rmi.server.codebase", "file:/C:/Users/prateek/workspace/RMI_Client/bin/");
				clientObject = new JavaRMIImpl();
				Naming.rebind(URL,clientObject);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public  void searchRMIObject()
	{
		Bacon b = new Bacon();
		BaconListner ref;
		try {
		ref = (BaconListner)Naming.lookup("rmi://127.0.0.1:1099/serverObject");
		System.out.println(ref);
		b.setFileVersion(1);
		b.setPortNumber(1200);
		ref.deposite(b);
		
		
	}catch(Exception e)
	{
		System.out.println(e.getStackTrace());
	}
	}

}
