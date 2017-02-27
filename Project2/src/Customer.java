
public class Customer implements Observer{

	String customerAddress;
	
	public Customer(String address){
		
		this.customerAddress = address;
		
	}
	
	public String getCustomerAddress(){
		
		return customerAddress;
		
	}
	public void setCustomerAddress(String customerAddress){
		
		this.customerAddress = customerAddress;
		
	}
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		
	}

}
