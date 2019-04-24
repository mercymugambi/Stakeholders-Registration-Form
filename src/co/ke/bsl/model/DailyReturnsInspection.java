package co.ke.bsl.model;

import org.hibernate.validator.constraints.NotEmpty;

public class DailyReturnsInspection {
	
	public String document_no;
	public String applicant_name;
	
	@NotEmpty
	public String inspection_date;
	
	@NotEmpty
	public String document_date;
	
	public String returns;
	
	@NotEmpty
	public String zone;
	
	@NotEmpty
	public String return_date;
	
	public String sugar_production;
	
	public String sugar_sales;
	
	public String closing_Stock;
	
	@NotEmpty
	public String document_status;
	
	public String Approval_stage;
	
	
	/**
	 * @return the document_no
	 */
	public String getDocument_no() {
		return document_no;
	}
	/**
	 * @return the applicant_name
	 */
	public String getApplicant_name() {
		return applicant_name;
	}
	/**
	 * @return the inspection_date
	 */
	public String getInspection_date() {
		return inspection_date;
	}
	/**
	 * @return the document_date
	 */
	public String getDocument_date() {
		return document_date;
	}
	/**
	 * @return the returns
	 */
	public String getReturns() {
		return returns;
	}
	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}
	/**
	 * @return the return_date
	 */
	public String getReturn_date() {
		return return_date;
	}
	/**
	 * @return the sugar_production
	 */
	public String getSugar_production() {
		return sugar_production;
	}
	/**
	 * @return the sugar_sales
	 */
	public String getSugar_sales() {
		return sugar_sales;
	}
	/**
	 * @return the closing_Stock
	 */
	public String getClosing_Stock() {
		return closing_Stock;
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
		return Approval_stage;
	}
	/**
	 * @param document_no the document_no to set
	 */
	public void setDocument_no(String document_no) {
		this.document_no = document_no;
	}
	/**
	 * @param applicant_name the applicant_name to set
	 */
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	/**
	 * @param inspection_date the inspection_date to set
	 */
	public void setInspection_date(String inspection_date) {
		this.inspection_date = inspection_date;
	}
	/**
	 * @param document_date the document_date to set
	 */
	public void setDocument_date(String document_date) {
		this.document_date = document_date;
	}
	/**
	 * @param returns the returns to set
	 */
	public void setReturns(String returns) {
		this.returns = returns;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
	/**
	 * @param return_date the return_date to set
	 */
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	/**
	 * @param sugar_production the sugar_production to set
	 */
	public void setSugar_production(String sugar_production) {
		this.sugar_production = sugar_production;
	}
	/**
	 * @param sugar_sales the sugar_sales to set
	 */
	public void setSugar_sales(String sugar_sales) {
		this.sugar_sales = sugar_sales;
	}
	/**
	 * @param closing_Stock the closing_Stock to set
	 */
	public void setClosing_Stock(String closing_Stock) {
		this.closing_Stock = closing_Stock;
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
		Approval_stage = approval_stage;
	}
	
	
	
	
	
	

}
