package com.onerivet.DeskBook.model.dtos;

import com.onerivet.DeskBook.model.entity.City;
import com.onerivet.DeskBook.model.entity.Columns;
import com.onerivet.DeskBook.model.entity.Floor;
import com.onerivet.DeskBook.model.entity.SeatNumber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeatConfigurationDto {

	private int id;
	private City cityId;
	private Floor floorId;
	private Columns columnId;
	private SeatNumber seatNumberId;
}
