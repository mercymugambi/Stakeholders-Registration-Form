/**
 * 
 */
package co.ke.bsl.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author mercy
 *
 */
public class HarvestReturnsInspection {

	public String document_number;
	
	@NotEmpty
	public String applicant_name;
	
	@NotEmpty
	public Date applicant_date;
	
	public String name;
	
	@NotEmpty
	public Date return_date;
	
	@NotEmpty
	public String millers;
	
	@NotEmpty
	public String return_type;
	
	@NotEmpty
	public String zone;
	
	@NotEmpty
	public String sugarcane;
	
	@NotEmpty
	public int year;
	
	@NotEmpty
	public int month;
	
	@NotEmpty
	public String outgrowers_pc;
	
	@NotEmpty
	public String outgrowers_r1;
	
	@NotEmpty
	public String outgrowers_r2;
	
	@NotEmpty
	public String outgrowers_r3;
	
	@NotEmpty
	public String nucleus_estate_pc;
	
	@NotEmpty
	public String nucleus_estate_r1;
	
	@NotEmpty
	public String nucleus_estate_r2;
	
	@NotEmpty
	public String nucleus_estate_r3;
	
	@NotEmpty
	public String document_status;
	
	@NotEmpty
	public String approval_stage;
	/**
	 * @return the document_number
	 */
	public String getDocument_number() {
		return document_number;
	}
	/**
	 * @return the applicant_name
	 */
	public String getApplicant_name() {
		return applicant_name;
	}
	/**
	 * @return the applicant_date
	 */
	public Date getApplicant_date() {
		return applicant_date;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the return_date
	 */
	public Date getReturn_date() {
		return return_date;
	}
	/**
	 * @return the millers
	 */
	public String getMillers() {
		return millers;
	}
	/**
	 * @return the return_type
	 */
	public String getReturn_type() {
		return return_type;
	}
	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}
	/**
	 * @return the sugarcane
	 */
	public String getSugarcane() {
		return sugarcane;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @return the outgrowers_pc
	 */
	public String getOutgrowers_pc() {
		return outgrowers_pc;
	}
	/**
	 * @return the outgrowers_r1
	 */
	public String getOutgrowers_r1() {
		return outgrowers_r1;
	}
	/**
	 * @return the outgrowers_r2
	 */
	public String getOutgrowers_r2() {
		return outgrowers_r2;
	}
	/**
	 * @return the outgrowers_r3
	 */
	public String getOutgrowers_r3() {
		return outgrowers_r3;
	}
	/**
	 * @return the nucleus_estate_pc
	 */
	public String getNucleus_estate_pc() {
		return nucleus_estate_pc;
	}
	/**
	 * @return the nucleus_estate_r1
	 */
	public String getNucleus_estate_r1() {
		return nucleus_estate_r1;
	}
	/**
	 * @return the nucleus_estate_r2
	 */
	public String getNucleus_estate_r2() {
		return nucleus_estate_r2;
	}
	/**
	 * @return the nucleus_estate_r3
	 */
	public String getNucleus_estate_r3() {
		return nucleus_estate_r3;
	}
	/**
	 * @return the document_status
	 */
	public String getDocument_status() {
		return document_status;
	}
	/**
	 * @return the approval_stage
	 */
	public String getApproval_stage() {
		return approval_stage;
	}
	/**
	 * @param document_number the document_number to set
	 */
	public void setDocument_number(String document_number) {
		this.document_number = document_number;
	}
	/**
	 * @param applicant_name the applicant_name to set
	 */
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	/**
	 * @param applicant_date the applicant_date to set
	 */
	public void setApplicant_date(Date applicant_date) {
		this.applicant_date = applicant_date;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param return_date the return_date to set
	 */
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	/**
	 * @param millers the millers to set
	 */
	public void setMillers(String millers) {
		this.millers = millers;
	}
	/**
	 * @param return_type the return_type to set
	 */
	public void setReturn_type(String return_type) {
		this.return_type = return_type;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
	/**
	 * @param sugarcane the sugarcane to set
	 */
	public void setSugarcane(String sugarcane) {
		this.sugarcane = sugarcane;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @param outgrowers_pc the outgrowers_pc to set
	 */
	public void setOutgrowers_pc(String outgrowers_pc) {
		this.outgrowers_pc = outgrowers_pc;
	}
	/**
	 * @param outgrowers_r1 the outgrowers_r1 to set
	 */
	public void setOutgrowers_r1(String outgrowers_r1) {
		this.outgrowers_r1 = outgrowers_r1;
	}
	/**
	 * @param outgrowers_r2 the outgrowers_r2 to set
	 */
	public void setOutgrowers_r2(String outgrowers_r2) {
		this.outgrowers_r2 = outgrowers_r2;
	}
	/**
	 * @param outgrowers_r3 the outgrowers_r3 to set
	 */
	public void setOutgrowers_r3(String outgrowers_r3) {
		this.outgrowers_r3 = outgrowers_r3;
	}
	/**
	 * @param nucleus_estate_pc the nucleus_estate_pc to set
	 */
	public void setNucleus_estate_pc(String nucleus_estate_pc) {
		this.nucleus_estate_pc = nucleus_estate_pc;
	}
	/**
	 * @param nucleus_estate_r1 the nucleus_estate_r1 to set
	 */
	public void setNucleus_estate_r1(String nucleus_estate_r1) {
		this.nucleus_estate_r1 = nucleus_estate_r1;
	}
	/**
	 * @param nucleus_estate_r2 the nucleus_estate_r2 to set
	 */
	public void setNucleus_estate_r2(String nucleus_estate_r2) {
		this.nucleus_estate_r2 = nucleus_estate_r2;
	}
	/**
	 * @param nucleus_estate_r3 the nucleus_estate_r3 to set
	 */
	public void setNucleus_estate_r3(String nucleus_estate_r3) {
		this.nucleus_estate_r3 = nucleus_estate_r3;
	}
	/**
	 * @param document_status the document_status to set
	 */
	public void setDocument_status(String document_status) {
		this.document_status = document_status;
	}
	/**
	 * @param approval_stage the approval_stage to set
	 */
	public void setApproval_stage(String approval_stage) {
		this.approval_stage = approval_stage;
	}
	
	
	
	
	
	
	
	
}
