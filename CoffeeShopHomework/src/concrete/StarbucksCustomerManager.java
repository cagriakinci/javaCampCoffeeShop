package concrete;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import abstracts.IPersonCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	IPersonCheckService customerCheckService;

	public StarbucksCustomerManager(IPersonCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Giriþ baþarýlý");
			System.out.println("Saved to db : " + customer.getFirstName());
		} else {
			System.out.println("Geçersiz kiþi");
		}
	}
}
