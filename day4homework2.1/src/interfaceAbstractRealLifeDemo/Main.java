package interfaceAbstractRealLifeDemo;

import java.rmi.RemoteException;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concret.CustomerCheckManager;
import Concret.NeroCustomerManager;
import Concret.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws RemoteException{
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.save(new Customer("Engin", "Demiroğ", 1985, "28861499108"));
		

		

	}

}
