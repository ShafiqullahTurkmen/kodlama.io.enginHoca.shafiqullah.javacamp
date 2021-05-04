package realLifeProjectDemo.abstracts;

import realLifeProjectDemo.entity.Customer;

public interface ICustomerService {
	
	public void add(IEntity customer);
	
	public void update(IEntity customer);
	
	public void delete(IEntity customer);

}
