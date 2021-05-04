package com.concrets;

import com.abstracts.IDiscountCampainDalService;
import com.abstracts.IDiscountCampainService;

public class OracleDiscountCampainDalManager implements IDiscountCampainDalService {

	@Override
	public void add(IDiscountCampainService discountService) {

		System.out.println("Yeni Kampanya Oracle veri tabanına eklendi.");
		System.out.println("Kampanya ismi: " + discountService.getCampainName());
	
	}

	@Override
	public void delete(IDiscountCampainService discountService) {
		System.out.printf("%s Oracl veri tabanından silindi.", discountService.getCampainName());
		System.out.println();
	}

	@Override
	public void update(IDiscountCampainService discountService) {
		System.out.printf("%s Oracl veri tabanında güncellendi.", discountService.getCampainName());
		System.out.println();
	}

}
