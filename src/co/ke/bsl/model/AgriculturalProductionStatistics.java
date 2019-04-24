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
public class AgriculturalProductionStatistics {
	
	@NotEmpty
	public Date document_date;
	
	@NotEmpty
	public String applicant_name;
	
	/**
	 * @return the document_date
	 */
	public Date getDocument_date() {
		return document_date;
	}
	/**
	 * @return the applicant_name
	 */
	public String getApplicant_name() {
		return applicant_name;
	}
	/**
	 * @param document_date the document_date to set
	 */
	public void setDocument_date(Date document_date) {
		this.document_date = document_date;
	}
	/**
	 * @param applicant_name the applicant_name to set
	 */
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	
	
	
	

	
	
	
}
