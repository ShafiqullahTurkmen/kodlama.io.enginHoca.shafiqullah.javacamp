package realLifeProjectDemo.concret;

import realLifeProjectDemo.abstracts.ICustomerDal;
import realLifeProjectDemo.abstracts.ICustomerService;
import realLifeProjectDemo.abstracts.IEntity;

public class NeroCustomerManager implements ICustomerService{

	ICustomerDal customerDal;
	
	
	
	public NeroCustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	@Override
	public void add(IEntity customer) {

		customerDal.add(customer);
	}

	@Override
	public void update(IEntity customer) {

		customerDal.delete(customer);
	}

	@Override
	public void delete(IEntity customer) {

		customerDal.delete(customer);
	}

}
