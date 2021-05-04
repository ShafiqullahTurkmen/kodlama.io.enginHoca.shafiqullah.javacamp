package realLifeProjectDemo.concret;

import realLifeProjectDemo.abstracts.ICustomerRewardService;
import realLifeProjectDemo.abstracts.IEntity;
import realLifeProjectDemo.entity.Customer;

public class RewardStarCustomerManager implements ICustomerRewardService {

	@Override
	public void reward(IEntity customer) {

		System.out.println(customer.getFirstName()+ " " + customer.getLastName() + " size Bol Şans 5 yildiz kazandinz.");
	}

}
