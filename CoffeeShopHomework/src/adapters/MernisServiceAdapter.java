package adapters;

import java.rmi.RemoteException;

import abstracts.IPersonCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNo()),customer.getFirstName(),customer.getLastName() , customer.getDateOfBirth());
	}
	
}
