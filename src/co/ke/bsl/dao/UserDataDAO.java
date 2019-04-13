package co.ke.bsl.dao;

import java.util.List;

import co.ke.bsl.model.AFAPartner;
import co.ke.bsl.model.County;
import co.ke.bsl.model.SubCounty;
import co.ke.bsl.model.Ward;

public interface UserDataDAO {

	
	public  AFAPartner  fetchRegistration();
	
	public  void  addFetchedRegistration(AFAPartner afaRegister);
	
	public  void  updateAFARegister(AFAPartner afaRegister);
	

	public  void  updateAFAPayment(String merchantRequestID,String checkoutRequestID,String resultCode,String resultDesc);
	
	public List<County> getCountyList();
	
	public List<SubCounty> getSubCountyList(int countyID);
	
	public List<Ward> getWardList(int subCountyID);
	

}
