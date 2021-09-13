package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public interface IPersonCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
