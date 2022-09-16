package com.xworkz.nirmalaEntity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="nirmala_Detials")
@ToString
public class NirmalaEntity implements Serializable{
	@Id
	private Integer id;
	private String location;
	private String gender;
	private String type;
	private Double cost;
	private Double duration;
	private String createdBy;
	private LocalDate createdDate;
	private String updateBy;
	private LocalDate updateDate;
	
	public NirmalaEntity(Integer id, String location, String gender, String type, Double cost, Double duration,
			String createdBy, LocalDate createdDate, String updateBy, LocalDate updateDate) {
		
		this.id = id;
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	

}
