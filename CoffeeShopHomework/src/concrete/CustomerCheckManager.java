package concrete;

import abstracts.IPersonCheckService;
import entities.Customer;

public class CustomerCheckManager implements IPersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;	
	}

}
