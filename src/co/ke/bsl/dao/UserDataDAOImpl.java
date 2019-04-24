/**
 * 
 */
package co.ke.bsl.dao;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MClient;
import org.compiere.model.MLocation;
import org.compiere.model.MPasswordRule;
import org.compiere.model.MUser;
import org.compiere.model.MUserRoles;
import org.compiere.util.Env;
import org.compiere.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.ke.bsl.model.AFAPartner;
import co.ke.bsl.model.County;
import co.ke.bsl.model.SubCounty;
import co.ke.bsl.model.Ward;
import co.ke.bsl.orm.entities.Officer;
import co.ke.phrm.model.MSPIIdentification;

/**
 * @author kirwa
 * 
 */
@Service("userDataDAO")
@Transactional
public class UserDataDAOImpl implements UserDataDAO {

	protected static Logger logger = Logger.getLogger("UserDataDAOImpl");

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	/*
	 * @Autowired private SessionFactory sessionFactoryMyql;
	 */
/*
	@Autowired
	@Qualifier("dataSourceMysql")
	private DataSource dataSourceMysql;*/

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/*
	 * public void setSessionFactoryMyql(SessionFactory sessionFactoryMyql) {
	 * this.sessionFactoryMyql = sessionFactoryMyql; }
	 */

/*	public void setDataSourceMyql(DataSource dataSourceMysql) {
		this.dataSourceMysql = dataSourceMysql;
	}
*/
	

	/*@Override
	public AFARegister fetchRegistration() {
		
		String sql = "SELECT `vurt9_visforms_1`.`id`," + 
				"	`F1`, " + 
				"   `F2`, " + 
				"  `F3`, " + 
				"  `F4`, " + 
				"   `F5`, " + 
				"    `F6`, " + 
				"  `F7`, " + 
				"   `F8`, " + 
				"    `F9`, " + 
				"    `F10`, " + 
				"   `F11`, " + 
				"   `F12`, " + 
				"    `F13` ," + 
				"    F15 ," + 
				"    F16 ," + 
				"    F17 ," + 
				"    F18 " + 
				" FROM `afaportal`.`vurt9_visforms_1` where published=0";
		Connection conn = null;
		String member_id = null;

		String meeting_id = null;
		
		AFARegister afaRegister = null;
		System.out.println("----sql" + sql);
		try {
			conn = dataSourceMysql.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		

			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				afaRegister=new AFARegister();
				member_id = rs.getString(1);
				meeting_id = rs.getString(2);

				afaRegister.setF1_firstName(rs.getString("F1"));
				afaRegister.setF2_surname(rs.getString("F2"));	
				afaRegister.setF3_otherNames(rs.getString("F3"));
				afaRegister.setF4_idNumber(rs.getString("F4"));
				afaRegister.setF6_phoneNumber(rs.getString("F6"));
				afaRegister.setF7_email(rs.getString("F7"));
				afaRegister.setF8_county(rs.getString("F8"));
				afaRegister.setF10_subCounty(rs.getString("F10"));
				afaRegister.setF11_location(rs.getString("F11"));
				afaRegister.setF12_address(rs.getString("F12"));
				afaRegister.setF13_town(rs.getString("F13"));
				afaRegister.setF15_companyName(rs.getString("F15"));
				afaRegister.setF16_tAXPIN(rs.getString("F16"));
				afaRegister.setF17_companyRegNumber(rs.getString("F17"));
				afaRegister.setF18_companyEmail(rs.getString("F18"));
		
			

				addFetchedRegistration(afaRegister);
				updateAFARegister(afaRegister);
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return afaRegister;
		
	}*/

	@Override
	public void addFetchedRegistration(AFAPartner afaRegister) {
		
	System.out.println("Adding new officer--------------"+afaRegister.getBuildingName());
		Officer officer = new Officer();		
		officer.setFirstname(afaRegister.getFirstName());
		officer.setMiddlename(afaRegister.getOtherNames());
		officer.setLastname(afaRegister.getSurname());
		officer.setIdno(afaRegister.getIdNumber());
		officer.setMobile(afaRegister.getPhoneNumber());
		officer.setEmail(afaRegister.getEmail());
		officer.setCounty(afaRegister.getCounty());
		officer.settAXPIN(afaRegister.gettAXPIN());
		officer.setCompanyEmail(afaRegister.getCompanyEmail());
		officer.setCompanyName(afaRegister.getCompanyName());
		officer.setCompanyRegNumber(afaRegister.getCompanyRegNumber());
		officer.setAddress(afaRegister.getPostalAddress());
		officer.setTown(afaRegister.getTown());
		officer.setPostalCode(afaRegister.getPostalCode());
		officer.setStreetName(afaRegister.getStreetName());
		officer.setBuildingName(afaRegister.getBuildingName());
		officer.setEstablishedDate(afaRegister.getEstablishedDate());
		officer.setLegalStatus(afaRegister.getLegalStatus());
		officer.setVillage(afaRegister.getVillage());
		officer.setLocation(afaRegister.getLocation());
		officer.setWard(afaRegister.getWard());	
		officer.setSubCounty(afaRegister.getSubCounty());
		
		
		
		
		System.out.println("Adding new officer--------------"+afaRegister.getWard());

		
		logger.debug("Adding new officer--------------");

		// Retrieve session from Hibernate
		Session session = sessionFactory.getCurrentSession();

		// Save
		session.saveOrUpdate(officer);
		session.flush();// TODO Auto-generated method stub
		MSPIIdentification mspiIdentification;
		
		MBPartner bpartner;
		
		MUser user;
		MUserRoles userRole;
		MBPartnerLocation location;

	
		String newPassword;
		MPasswordRule pwdrule = MPasswordRule.getRules(Env.getCtx(), null);
		if (pwdrule != null) {
			newPassword = pwdrule.generate();
		} else {
			SecureRandom random = new SecureRandom();
			newPassword = BigInteger.probablePrime(50, random).toString(Character.MAX_RADIX);
		}

		bpartner = new MBPartner(Env.getCtx(), 0, null);
		bpartner.setName(afaRegister.getCompanyName());
		bpartner.setValue(afaRegister.getCompanyRegNumber());
		bpartner.setTaxID(rs.getString("taxpin"));

		/*
		 * if(rs.getBoolean("isrecruit")==false){
		 * 
		 * bpartner.setIsRecruit(false); }
		 */
		// bpartner.setIsYouthCommunity(true);
		bpartner.setIsCustomer(true);

		/// bpartner.setIsDisabled(rs.getBoolean("disabled"));
		// bpartner.setDocStatus("DR");

		// bpartner.setDOB(rs.getTimestamp("DOB"));
		bpartner.setC_BP_Group_ID(1000005);
		bpartner.setAD_Org_ID(Env.getAD_Org_ID(Env.Env.getCtx()));
		bpartner.setIsActive(true);

		/*
		 * System.out.println(image.getAD_Image_ID());
		 * bpartner.setLogo_ID(image.getAD_Image_ID());
		 */
		if (bpartner.save()) {

			location = new MBPartnerLocation(Env.getCtx(), 0, null);
			MLocation mlocation = new MLocation(Env.getCtx(), 0, null);
			mlocation.setAddress1(rs.getString("address"));
			mlocation.setC_City_ID(1000003);
			mlocation.setC_Country_ID(219);

			mlocation.save();

			/*
			 * buildingname, active, address, approved, companyemail, companyname,
			 * companyregnumber, county, createdate, email, establisheddate, firstname,
			 * idno, lastname, legalstatus, location, middlename, mobile, postalcode,
			 * streetname, subcounty, taxpin, town, txndate, village, ward
			 */

			location.setpostaladdress(rs.getString("address"));
			// location.setName(rs.getString("town"));
			location.setplotno(rs.getString("companyregnumber"));
			location.setPhone(rs.getString("mobile"));
			location.setC_BPartner_ID(bpartner.getC_BPartner_ID());
			location.setIsBillTo(true);
			location.setIsShipTo(true);
			location.setC_Location_ID(mlocation.getC_Location_ID());
			// location.setplotno((rs.getString("taxpin"));
			location.setpostalcode(Integer.parseInt(rs.getString("postalcode")));
			location.setcomp_regno(rs.getString("companyregnumber"));
			location.setSPD_County_ID(Integer.parseInt(rs.getString("county")));
			location.setSPD_SubCounty_ID(Integer.parseInt(rs.getString("subcounty")));
			location.setSPD_Afadivision_ID(Integer.parseInt(rs.getString("ward")));
			location.setroadstreet(rs.getString("streetname"));
			location.setbuildingname(rs.getString("buildingname"));
			location.setvillage(rs.getString("village"));

			Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("establisheddate"));
			Timestamp ts = new Timestamp(date1.getTime());
			location.setestablish_date(ts);
			location.setlegalstatus(rs.getString("legalstatus"));

			location.save();

			System.out.println("After saving the location" + bpartner.getC_BPartner_ID());

			mspiIdentification = new MSPIIdentification(Env.getCtx(), 0, null);
			mspiIdentification.setidno(rs.getString("idno"));
			// mspiIdentification.setLogo_ID(fingerPrint.getAD_Image_ID());
			mspiIdentification.setAD_Org_ID(1000002);
			mspiIdentification.setC_BPartner_ID(bpartner.getC_BPartner_ID());
			mspiIdentification.save();

			System.out.println("After saving the identification");

			user = new MUser(Env.getCtx(), 0, null);

			user.setAD_Org_ID(1000000);
			user.setC_BPartner_ID(bpartner.getC_BPartner_ID());
			user.setPassword(newPassword);
			user.setName(rs.getString("lastname") + " " + rs.getString("firstname") + " "
					+ rs.getString("middlename"));
			user.setEMail(rs.getString("email"));
			user.setEMailUser(rs.getString("companyemail"));
			user.setIsExpired(true);
			user.setPhone(normalizePhoneNumber(rs.getString("mobile")));
			user.save();

			userRole = new MUserRoles(Env.getCtx(), 0, null);
			userRole.setAD_User_ID(user.getAD_User_ID());
			userRole.setAD_Org_ID(1000000);
			userRole.setAD_Role_ID(1000001);

			userRole.save();

			System.out.println("After saving the user and org access");

			StringBuffer sb = new StringBuffer();

			String subject = "AFA IMIS User Account";

			sb.append("Dear " + bpartner.getName() + ", " + "<br/> ");

			sb.append(" <br/> ");
			sb.append("Thank you for registering  at AFA IMIS System, your login details are:- " + " <br/> ");
			sb.append("Email: " + user.getEMail() + " <br/> ");
			sb.append("Password: " + user.getPassword() + " <br/> ");
			sb.append("Link: " + WebUtil.getHostIP() + ":8080/webui/ <br/> ");
			sb.append("You will be prompted to change your password after login. <br/> ");
			// sb.append(to + " <br/>; ");
			sb.append("Regards,  <br/>");
			sb.append("AFA Admin <br/> ");

			MClient client = new MClient(Env.getCtx(), user.getAD_Client_ID(), null);

			client.sendEMail(user.getEMail(), subject, sb.toString(), null, true);
			client.sendEMail(user.getEMailUser(), subject, sb.toString(), null, true);

		
	}

	/*@Override
	public void updateAFARegister(AFARegister afaRegister) {

		System.out.println("Adding new  officer---------at the DAO-----");
		String sqlI = "UPDATE `afaportal`.`vurt9_visforms_1` SET `published` = 1 WHERE `F7` ='" +afaRegister.getF7_email()+"';" ;
				
		Connection conn = null;
		try {
			conn = dataSourceMysql.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlI);
			System.out.println("sql " + sqlI);
			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

		
	}*/

	@Override
	public void updateAFAPayment(String merchantRequestID, String checkoutRequestID, String resultCode,
			String resultDesc) {
		System.out.println("Adding new  officer---------at the DAO-----");
		String sqlI = "UPDATE  adempiere.Afa_License_Payment set IsPaid='Y', ResponseCode='"+resultCode+"' payment_date=current_date  where  checkoutRequest='"+checkoutRequestID+"'";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlI);
			System.out.println("sql " + sqlI);
			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	@Override
	public AFAPartner fetchRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAFARegister(AFAPartner afaRegister) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<County> getCountyList() {
		 County county =null;
		 List<County> countyList =new ArrayList<County>();
		System.out.println("Adding new  officer---------at the DAO-----");
		String sqlI = "SELECT spd_county_id,  name  FROM adempiere.spd_county";
		Connection conn = null;
		try {
		
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlI);
			System.out.println("sql " + sqlI);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				county=new County();
				county.setName(rs.getString(2));
				county.setSpd_county_id(rs.getString(1));
				countyList.add(county);
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
					
				} catch (SQLException e) {
				}
			}
		}
		return countyList;
	}

	@Override
	public List<SubCounty> getSubCountyList(int countyID) {
		 SubCounty subCounty =null;
		 List<SubCounty> subCountyList =new ArrayList<SubCounty>();
		 System.out.println("the county id "+countyID);
		String sqlI = "SELECT spd_subcounty_id,  name  FROM adempiere.spd_subcounty where spd_county_id="+countyID;
		Connection conn = null;
		try {
		
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlI);
			System.out.println("sql " + sqlI);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				subCounty=new SubCounty();
				subCounty.setName(rs.getString(2));
				subCounty.setSpd_subcounty_id(rs.getString(1));
				subCountyList.add(subCounty);
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return subCountyList;
	}

	@Override
	public List<Ward> getWardList(int subCountyID) {
		Ward Ward =null;
		 List<Ward> WardList =new ArrayList<Ward>();
		System.out.println("Adding new  officer---------at the DAO-----");
		String sqlI = "SELECT spd_afadivision_id,  name  FROM adempiere.spd_afadivision where spd_subcounty_id="+subCountyID;
		Connection conn = null;
		try {
		
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlI);
			System.out.println("sql " + sqlI);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Ward=new Ward();
				Ward.setName(rs.getString(2));
				Ward.setSpd_afadivision_id(rs.getString(1));
				WardList.add(Ward);
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return WardList;
	}
		
	

}
