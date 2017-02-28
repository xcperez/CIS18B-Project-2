import java.util.Observable;


public class Magazine extends Observable{

	private String address;
	private String message;
	
	public Magazine(){
		
	}
	
	public void messageChanged(){
		
		setChanged();
		notifyObservers(message);
		
	}
	public void newMessage(String nMessage){
		
		message = nMessage;
		messageChanged();
		
	}
	public void setAddress(String address){
		
		this.address = address;
		
	}
	public String getAddress(){
		
		return address;
		
	}
	
	public String getMessage(){
		
		return message;
	}

}
