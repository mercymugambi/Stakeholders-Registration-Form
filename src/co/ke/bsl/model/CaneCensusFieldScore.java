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
public class CaneCensusFieldScore {
	
	
	public String document_number;
	
	@NotEmpty
	public String sugar_company;
	
	public String longitude;
	
	@NotEmpty
	public Date document_date;
	
	public String latitude;
	
	@NotEmpty
	public String doc_status;
	
	
	public String approval_status;
	public String county;
	/**
	 * @return the document_number
	 */
	public String getDocument_number() {
		return document_number;
	}
	/**
	 * @return the sugar_company
	 */
	public String getSugar_company() {
		return sugar_company;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	
	/**
	 * @return the document_date
	 */
	public Date getDocument_date() {
		return document_date;
	}
	/**
	 * @param document_date the document_date to set
	 */
	public void setDocument_date(Date document_date) {
		this.document_date = document_date;
	}
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @return the doc_status
	 */
	public String getDoc_status() {
		return doc_status;
	}
	/**
	 * @return the approval_status
	 */
	public String getApproval_status() {
		return approval_status;
	}
	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}
	/**
	 * @param document_number the document_number to set
	 */
	public void setDocument_number(String document_number) {
		this.document_number = document_number;
	}
	/**
	 * @param sugar_company the sugar_company to set
	 */
	public void setSugar_company(String sugar_company) {
		this.sugar_company = sugar_company;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @param document_date the document_date to set
	 */
	
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @param doc_status the doc_status to set
	 */
	public void setDoc_status(String doc_status) {
		this.doc_status = doc_status;
	}
	/**
	 * @param approval_status the approval_status to set
	 */
	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	
	
	
	
}
