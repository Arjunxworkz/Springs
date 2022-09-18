package com.xworkz.basanti.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@Entity
@Table(name="nirmala_detials")
public class BasantiEntity implements  Serializable{
	private Integer id;
	private String location;
	private String type;
	private Double cost;
	private Double duration;
	private String createdBy;
	private LocalDate createdDate;
	private String updateBy;
	private LocalDate updateDate;
	
	public BasantiEntity() {
		
	}

	public BasantiEntity(Integer id, String location, String type, Double cost, Double duration, String createdBy,
			LocalDate createdDate, String updateBy, LocalDate updateDate) {
		//super();
		this.id = id;
		this.location = location;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	

	@Override
	public String toString() {
		return "BasantiEntity [id=" + id + ", location=" + location + ", type=" + type + ", cost=" + cost
				+ ", duration=" + duration + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updateBy="
				+ updateBy + ", updateDate=" + updateDate + "]";
	}
	
	
}
