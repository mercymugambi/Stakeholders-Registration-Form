package co.ke.bsl.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class AFAPartner {
	
	@Size(min = 2, max = 30)
	private String firstName;
	
	@NotEmpty
	private String surname;
	
	@NotEmpty
	private String otherNames;
	
	@NotEmpty
	private String idNumber;
	
	@Phone
	private String phoneNumber;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String county;
	
	@NotEmpty
	private String subCounty;
	
	@NotEmpty
	private String ward;
	
	
	@NotEmpty
	private String village;
	
	private String location;
	@NotEmpty
	@Size(min = 2, max = 50)
	private String postalAddress;
	
	@NotEmpty
	@Size(min = 2, max = 50)
	private String postalCode;
	
	
	@NotEmpty
	@Size(min = 2, max = 50)
	private String town;
	
	@NotEmpty
	private String streetName;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String companyName;
	
	@NotEmpty
	private String buildingName;
	
	@NotEmpty
	private String establishedDate;
	
	@NotEmpty
	@Size(min = 2, max = 30)
	private String tAXPIN;
	
	@NotEmpty
	@Size(min = 2, max = 30)
	private String companyRegNumber;
	
	@NotEmpty
	@Email
	private String companyEmail;
	
	
    private String captcha;
    
    @NotEmpty
	private String legalStatus;
    
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the otherNames
	 */
	public String getOtherNames() {
		return otherNames;
	}
	/**
	 * @param otherNames the otherNames to set
	 */
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the captcha
	 */
	public String getCaptcha() {
		return captcha;
	}
	/**
	 * @param captcha the captcha to set
	 */
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the postalAddress
	 */
	public String getPostalAddress() {
		return postalAddress;
	}
	/**
	 * @param postalAddress the postalAddress to set
	 */
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
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
	 * @return the ward
	 */
	public String getWard() {
		return ward;
	}
	/**
	 * @param ward the ward to set
	 */
	public void setWard(String ward) {
		this.ward = ward;
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
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}
	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	/**
	 * @return the establishedDate
	 */
	public String getEstablishedDate() {
		return establishedDate;
	}
	/**
	 * @param establishedDate the establishedDate to set
	 */
	public void setEstablishedDate(String establishedDate) {
		this.establishedDate = establishedDate;
	}
	/**
	 * @return the legalStatus
	 */
	public String getLegalStatus() {
		return legalStatus;
	}
	/**
	 * @param legalStatus the legalStatus to set
	 */
	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}
	
	
	
	

}
