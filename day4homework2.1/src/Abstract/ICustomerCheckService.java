package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
