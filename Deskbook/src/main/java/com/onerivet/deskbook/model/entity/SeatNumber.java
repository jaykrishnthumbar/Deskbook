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
@Table(name = "SeatNumber",schema = "Ref")
public class SeatNumber {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SeatNumberId")
	private int id;
	@Column(name = "SeatNumber")
	private String seatNumber;

}
