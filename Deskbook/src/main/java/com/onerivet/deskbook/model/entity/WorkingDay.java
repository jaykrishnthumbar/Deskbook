package com.onerivet.DeskBook.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "WorkingDay",schema = "Ref")
public class WorkingDay {
	@Id
	@Column(name = "WorkingDayId")
	private int id;
	@Column(name = "Day")
	private String day;

}