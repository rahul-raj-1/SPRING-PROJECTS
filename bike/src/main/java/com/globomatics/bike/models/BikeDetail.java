package com.globomatics.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="BIKE_DETAIL")

public class BikeDetail {
	



	@Id
	@Column(name = "BIKE_ID")
   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long bikeId;
	
	@Column(name = "MANUFACTURE_DATE")
    private Date manufactureDate;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	
	@Column(name = "COUNTRY")
	private String country;
	
	
	public Long getBikeId() {
		return bikeId;
	}


	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}


	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
