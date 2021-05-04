package realLifeProjectDemo.concret;

import java.rmi.RemoteException;

import realLifeProjectDemo.abstracts.ICustomerCheckService;
import realLifeProjectDemo.abstracts.IEntity;
import realLifeProjectDemo.entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(IEntity customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()), customer.getFirstName(),	customer.getLastName(), customer.getDateOfBirth());
			 
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
