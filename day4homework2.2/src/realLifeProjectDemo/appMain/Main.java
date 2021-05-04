package realLifeProjectDemo.appMain;

import realLifeProjectDemo.abstracts.ICustomerService;
import realLifeProjectDemo.abstracts.IEntity;
import realLifeProjectDemo.concret.MernisCustomerCheckManager;
import realLifeProjectDemo.concret.MsSqlCustomerDal;
import realLifeProjectDemo.concret.NeroCustomerManager;
import realLifeProjectDemo.concret.RewardStarCustomerManager;
import realLifeProjectDemo.concret.StarBucksCustomerManager;
import realLifeProjectDemo.entity.Customer;

public class Main {
	public static void main(String[] args) {
		
		IEntity customer = new Customer("Engin", "Demiroğ", 1985,"28861499108");
		
		
		ICustomerService customerManager = new StarBucksCustomerManager(new MsSqlCustomerDal(),
																		new MernisCustomerCheckManager(),
				   													    new RewardStarCustomerManager());
		
		customerManager.add(customer);
		
		System.out.println("********************************************************");
		
		customerManager.delete(customer);
		
	}
}
