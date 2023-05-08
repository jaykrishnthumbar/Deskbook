package com.onerivet.DeskBook.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "SeatConfiguration")
public class SeatConfiguration {
	@Id
	@Column(name = "SeatConfigurationId")
	private int id;
	@OneToOne
	@JoinColumn(name = "CityId")
	private City cityId;
	@OneToOne
	@JoinColumn(name = "FloorId")
	private Floor floorId;
	@OneToOne
	@JoinColumn(name = "ColumnId")
	private Columns columnId;
	@OneToOne
	@JoinColumn(name = "SeatNumberId")
	private SeatNumber seatNumberId;	

}
