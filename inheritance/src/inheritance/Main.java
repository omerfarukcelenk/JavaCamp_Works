package inheritance;

public class Main {

	public static void main(String[] args) {
			IndividualCustomer engin = new IndividualCustomer();
			engin.customerNumber = "12345";
			
			CorporateCustomer hepsiburda = new CorporateCustomer();
			hepsiburda.customerNumber = "78910";
			
			Sendika abc = new Sendika();
			abc.customerNumber = "99999";
			
			
			CustomerManager customerManager = new CustomerManager();
			//customerManager.add(hepsiburda);
			//customerManager.add(engin);
			//customerManager.add(abc);
			Customer[] customers = {engin, abc, hepsiburda};
			
			
			
			customerManager.addMultiple(customers);
	}

}
