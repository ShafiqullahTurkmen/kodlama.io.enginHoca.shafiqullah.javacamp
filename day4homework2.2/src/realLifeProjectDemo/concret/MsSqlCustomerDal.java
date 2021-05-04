package realLifeProjectDemo.concret;

import realLifeProjectDemo.abstracts.ICustomerDal;
import realLifeProjectDemo.abstracts.IEntity;
import realLifeProjectDemo.entity.Customer;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add(IEntity customer) {

		System.out.println("Müşteri ismi: " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("MsSql veri tabanına eklendı");
	}

	@Override
	public void update(IEntity customer) {

		System.out.println("Müşteri ismi " + customer.getFirstName());
		System.out.println("MsSql veri tabanına bilgiler güncellendi");		
	}

	@Override
	public void delete(IEntity customer) {

		System.out.println("Müşteri ismi " + customer.getFirstName());
		System.out.println("MsSql veri tabanından silindi");		
	}

}
