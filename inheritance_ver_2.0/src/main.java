
public class main {

	public static void main(String[] args) {
		
		CustomerManager  customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());

	}

}
