import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer1 = new Customer(1,"Çaðrý","Akýncý",1998,"11111111111");
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
	}

}
