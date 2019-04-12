/**
 * 
 */
package co.ke.bsl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.ke.bsl.model.AFAPartner;
import co.ke.bsl.orm.entities.Officer;

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
	
		
	
		logger.debug("Adding new  officer--------------");

		// Retrieve session from Hibernate
		Session session = sessionFactory.getCurrentSession();

		// Save
		session.saveOrUpdate(officer);
		session.flush();// TODO Auto-generated method stub
		
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
		
	

}
