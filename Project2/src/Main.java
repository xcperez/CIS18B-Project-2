import java.util.Scanner;
public class Main{

	public static void main(String[]args){
		
		int choice;
		String address;
		String message; 
		
		Magazine natGeo = new Magazine();
		Observer newCust = new Customer();
		
		System.out.println("Hello, did you want to\n"
			+ "1. Add Subscriber\n"
			+ "2. Remove Subscriber\n"
			+ "3. Send message to all subscribers\n");
		
		Scanner scan = new Scanner(System.in);
		
		choice = scan.nextInt();
		
		while(choice != 1 && choice != 2 && choice != 3){
			
			System.out.println("That was not a valid input."
					+ "Please try again.\n");
			choice = scan.nextInt();
			
		}
		if(choice == 1){
			
			System.out.println("Please enter an address.");
			
		}else if(choice == 2){
			
			
		}else{
			
			System.out.println("Please enter a message");
			
			message = scan.next();
			natGeo.newMessage(message);
			
			
			
		}
	}
	

}
