import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer, DisplayElement{

	Observable observable;
	private String message;
	private String address;
	

	public Customer(Observable observable){
		
		this.observable = observable;
		observable.addObserver(this);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(message);
		
	}

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		
		if(obs instanceof Magazine){
			
			Magazine magazine = (Magazine)obs;
			//this.address = magazine.getAddress();
			this.message = magazine.getMessage();
			display();
		}
		
	}

}
