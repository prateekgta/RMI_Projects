
import java.util.*;






public class CheckTime implements Runnable{

	
	public static  HashMap<Integer,Bacon> hs=new HashMap<Integer,Bacon>();
	
	
	@SuppressWarnings("deprecation")
	public void run(){
	  
		while(true){
			try {
				Thread.sleep(2000);
				Date tm=new Date();
				
				
				List<Bacon> list = new ArrayList<Bacon>(hs.values());
				if(!list.isEmpty())
				{
					for(Bacon b: list)
					{
					Integer hour=tm.getHours();		
					Integer min=tm.getMinutes();
					Integer sec= tm.getSeconds();
					b.time= b.time.replaceAll("\\s+","");
					String s1[]=b.time.split(":");
					Integer bHour=Integer.parseInt(s1[0]);
					Integer bMin=Integer.parseInt(s1[1]);
					Integer bSec=Integer.parseInt(s1[2]);
					System.out.println("System timings"+hour+":"+min+":"+sec);
					System.out.println("Bacon timing"+bHour+":"+bMin+":"+bSec);
					Integer dhour=hour-bHour;
					Integer dmin=min-bMin;
					
					System.out.println("difference in time : --"+dmin);
					
					
					
					if(dhour==0)
					{
						if(dmin==1)
						{
							if(sec>bSec)
							{
								System.out.println("Port Dead, no response from client :"+b.port);
								hs.remove(b.getPort());
							
							}
						}
					}
						
					}
					
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	 }
	
	
	public static void setList(Integer port,Bacon newB) {
		
			hs.put(port, newB);
		
	}

}
	

