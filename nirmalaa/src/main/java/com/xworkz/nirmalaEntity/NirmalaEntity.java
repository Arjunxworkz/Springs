package com.xworkz.nirmalaEntity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;

import io.smallrye.common.constraint.NotNull;
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
	@Min(value=1)
	private Integer id;
	@NotNull
	private String location;
	@NotNull
	private String gender;
	@NotNull
	private String type;
	@NotNull @Min(value=10) @Max(value=100)
	private Double cost;
	@NotNull
	private Double duration;
	@NotNull
	private String createdBy;
	@NotNull @PastOrPresent
	private LocalDate createdDate;
	@NotNull
	private String updateBy;
	@NotNull @PastOrPresent
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
