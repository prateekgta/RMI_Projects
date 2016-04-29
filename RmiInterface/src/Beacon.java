import java.io.Serializable;


public class Beacon implements Serializable {
	
	public int id;
	public String startUpTIme;
	public String cmdAgentId;
	public String ip;
	public int port;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartUpTIme() {
		return startUpTIme;
	}
	public void setStartUpTIme(String startUpTIme) {
		this.startUpTIme = startUpTIme;
	}
	public String getCmdAgentId() {
		return cmdAgentId;
	}
	public void setCmdAgentId(String cmdAgentId) {
		this.cmdAgentId = cmdAgentId;
	}
	
	
	public Beacon(int id, String startUpTIme, String cmdAgentId,String ip,int port) {
		super();
		this.id = id;
		this.startUpTIme = startUpTIme;
		this.cmdAgentId = cmdAgentId;
		this.ip=ip;
		this.port=port;
	}
	
	public Beacon(int id, String startUpTIme, String cmdAgentId) {
		super();
		this.id = id;
		this.startUpTIme = startUpTIme;
		this.cmdAgentId = cmdAgentId;
	}
	@Override
	public String toString() {
		return "Beacon [id=" + id + ", startUpTIme=" + startUpTIme
				+ ", cmdAgentId=" + cmdAgentId + ", ip=" + ip + ", port=" + port + "]";
	}
	
	
		
}
