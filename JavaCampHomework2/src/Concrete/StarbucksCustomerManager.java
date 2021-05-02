package Concrete;

import Abstract.*;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if (_customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<Mernis Kontrolu Starbucks icin yapildi>>>>>>>>>>>>>>>>>>>> ");
			super.save(customer);
		}
		
		else {
			System.out.println(customer.getFirstName() + " gercek bir insan degil!");
		}
	}
	
}
