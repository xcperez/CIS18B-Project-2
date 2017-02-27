import java.util.ArrayList;


public class Magazine implements Subject{

	private ArrayList<Observer> observers;
	String message;
	
	public Magazine(){
		
		observers = new ArrayList<Observer>();
		
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for(Observer observer : observers){
			
			observer.update(message);
			
		}
		
	}

}
