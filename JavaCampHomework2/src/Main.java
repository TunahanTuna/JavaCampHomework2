

import java.util.*;

import Abstract.*;
import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) {
		
		//Starbucks Icin Ekleme
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		// Gercek insan kaydi
		Customer tunahan = new Customer(1,"Mustafa Tunahan","Tuna",new Date(1998, 5, 8), "46003555154");
		// Sahte insan kaydi
		Customer fake = new Customer(1,"Ali","İnsan",new Date(198, 5, 8), "1218281");
		customerManager.save(tunahan);
		customerManager.save(fake);
		//Nero Icin Ekleme
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		
		Customer eda = new Customer(1,"Eda","Tuna",new Date(2000, 10, 27), "12434654");
		customerManager2.save(eda);
	}

}
