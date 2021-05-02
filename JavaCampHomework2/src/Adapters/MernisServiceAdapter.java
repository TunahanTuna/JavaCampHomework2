package Adapters;

import java.net.URL;
import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()),customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth().getYear());
		}
		catch (NumberFormatException e){
			e.printStackTrace();
		}
		catch(RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
}
