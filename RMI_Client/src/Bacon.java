import java.io.Serializable;




public class Bacon implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int portnumber;
	private int fileversion;


public void setPortNumber(int j)
{
	portnumber=j;
	}

public int getPortNumber()
{
	return portnumber;
	}


public void setFileVersion(int k)
{
	fileversion=k;
	}

public int getFileVersion()
{
	return fileversion;
	}

}