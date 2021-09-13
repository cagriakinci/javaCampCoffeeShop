package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public interface ICustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;
}
