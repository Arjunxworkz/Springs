package com.xworkz.metroEntity;

import java.io.Serializable;

import javax.persistence.Table;
@Table(name="metro_info")
public class MetroEntity implements Serializable{

	private String metroStationName;
	private Integer metroNumber;
	private String driverName;
	//private Integer totalBogi;
	private Double ticketPrice;
	
	
	public MetroEntity() {
		
	}


	public String getMetroStationName() {
		return metroStationName;
	}


	public void setMetroStationName(String metroStationName) {
		this.metroStationName = metroStationName;
	}


	public Integer getMetroNumber() {
		return metroNumber;
	}


	public void setMetroNumber(Integer metroNumber) {
		this.metroNumber = metroNumber;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


//	public Integer getTotalBogi() {
//		return totalBogi;
//	}
//
//
//	public void setTotalBogi(Integer totalBogi) {
//		this.totalBogi = totalBogi;
//	}


	public Double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	@Override
	public String toString() {
		return "MetroEntity [metroStationName=" + metroStationName + ", metroNumber=" + metroNumber + ", driverName="
				+ driverName + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}
