package co.ke.bsl.orm.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "officer")
public class Officer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_seq")
	@SequenceGenerator(sequenceName = "APPROLE_ID_seq", name = "ID_seq")
	@Column(name = "id", unique = true, nullable = false)
	private long officerID;


	@Column(length = 255)
	private String firstname;

	@Column(length = 255)
	private String middlename;

	@Column(length = 255)
	private String lastname;

	
	private String county;

	@Column
	private String subCounty;

	@Column
	private String village;

	@Column(length = 255, unique = true)
	private String idno;
	

	@Column(length = 255, unique = true)
	private String email;

	
	@Column(length = 255)
	private String address;

	@Column(length = 255)
	private String mobile;


	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date txndate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date createdate;

	@Column(length = 1)
	private String active;

	@Column(length = 255)
	private String approved;
	
	@Column(length = 255)
	private String companyName;
	
	@Column(length = 255)
	private String tAXPIN;
	
	@Column(length = 255)
	private String companyRegNumber;
	
	@Column(length = 255)
	private String companyEmail;
	
	@Column(length = 255)
	private String town;

	/**
	 * @return the officerID
	 */
	public long getOfficerID() {
		return officerID;
	}

	/**
	 * @param officerID the officerID to set
	 */
	public void setOfficerID(long officerID) {
		this.officerID = officerID;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the middlename
	 */
	public String getMiddlename() {
		return middlename;
	}

	/**
	 * @param middlename the middlename to set
	 */
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the subCounty
	 */
	public String getSubCounty() {
		return subCounty;
	}

	/**
	 * @param subCounty the subCounty to set
	 */
	public void setSubCounty(String subCounty) {
		this.subCounty = subCounty;
	}

	/**
	 * @return the village
	 */
	public String getVillage() {
		return village;
	}

	/**
	 * @param village the village to set
	 */
	public void setVillage(String village) {
		this.village = village;
	}

	/**
	 * @return the idno
	 */
	public String getIdno() {
		return idno;
	}

	/**
	 * @param idno the idno to set
	 */
	public void setIdno(String idno) {
		this.idno = idno;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the txndate
	 */
	public Date getTxndate() {
		return txndate;
	}

	/**
	 * @param txndate the txndate to set
	 */
	public void setTxndate(Date txndate) {
		this.txndate = txndate;
	}

	/**
	 * @return the createdate
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * @param createdate the createdate to set
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}

	/**
	 * @return the approved
	 */
	public String getApproved() {
		return approved;
	}

	/**
	 * @param approved the approved to set
	 */
	public void setApproved(String approved) {
		this.approved = approved;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the tAXPIN
	 */
	public String gettAXPIN() {
		return tAXPIN;
	}

	/**
	 * @param tAXPIN the tAXPIN to set
	 */
	public void settAXPIN(String tAXPIN) {
		this.tAXPIN = tAXPIN;
	}

	/**
	 * @return the companyRegNumber
	 */
	public String getCompanyRegNumber() {
		return companyRegNumber;
	}

	/**
	 * @param companyRegNumber the companyRegNumber to set
	 */
	public void setCompanyRegNumber(String companyRegNumber) {
		this.companyRegNumber = companyRegNumber;
	}

	/**
	 * @return the companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * @param companyEmail the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	
	

}
