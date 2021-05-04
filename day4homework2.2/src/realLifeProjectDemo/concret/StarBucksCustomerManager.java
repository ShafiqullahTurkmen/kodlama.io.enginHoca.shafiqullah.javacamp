package realLifeProjectDemo.concret;

import realLifeProjectDemo.abstracts.ICustomerCheckService;
import realLifeProjectDemo.abstracts.ICustomerDal;
import realLifeProjectDemo.abstracts.ICustomerRewardService;
import realLifeProjectDemo.abstracts.ICustomerService;
import realLifeProjectDemo.abstracts.IEntity;
import realLifeProjectDemo.entity.Customer;

public class StarBucksCustomerManager implements ICustomerService{

	private ICustomerDal customerDal;
	private ICustomerCheckService customerCheck;
	private ICustomerRewardService customerReward;
	
	
	public StarBucksCustomerManager(ICustomerDal customerDal, ICustomerCheckService customerCheck,
			ICustomerRewardService customerReward) {
		super();
		this.customerDal = customerDal;
		this.customerCheck = customerCheck;
		this.customerReward = customerReward;
	}

	@Override
	public void add(IEntity customer) {

		if(customerCheck.checkIfRealPerson(customer)) {
			customerDal.add(customer);
			customerReward.reward(customer);
		} else {
			System.out.println("Invalid Person to add: " + customer.getFirstName() + " " + customer.getLastName());
		}
	}

	@Override
	public void update(IEntity customer) {
		if(customerCheck.checkIfRealPerson(customer)) {
			customerDal.update(customer);
		} else {
			System.out.println("Invalid Person to update: " + customer.getFirstName() + " " + customer.getLastName());
		}		
	}

	@Override
	public void delete(IEntity customer) {
		if(customerCheck.checkIfRealPerson(customer)) {
			customerDal.delete(customer);
		} else {
			System.out.println("Invalid Person to delete: " + customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
