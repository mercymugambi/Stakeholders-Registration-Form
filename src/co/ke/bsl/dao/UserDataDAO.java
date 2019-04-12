package co.ke.bsl.dao;

import co.ke.bsl.model.AFAPartner;

public interface UserDataDAO {

	
	public  AFAPartner  fetchRegistration();
	
	public  void  addFetchedRegistration(AFAPartner afaRegister);
	
	public  void  updateAFARegister(AFAPartner afaRegister);
	

	public  void  updateAFAPayment(String merchantRequestID,String checkoutRequestID,String resultCode,String resultDesc);

}
