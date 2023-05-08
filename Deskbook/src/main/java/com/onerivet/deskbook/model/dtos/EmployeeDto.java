package com.onerivet.DeskBook.model.dtos;

import com.onerivet.DeskBook.model.entity.Designation;
import com.onerivet.DeskBook.model.entity.ModeOfWork;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	private int id;
	private String userId;
	
	@NotEmpty(message = "Enter the email...")
	@Pattern(regexp = "^[A-Za-z0-9.]+@[A-Za-z0-9]+\\.com$", message = "Enter email in valid format...(EX:Abc123@gmail.com)")
	private String emailId;
	
	@NotEmpty(message = "Enter the first name...")
	@Size(min = 2, message = "Minimum length of first name is 2...")
	@Size(max = 10, message = "Maximum length of first name is 100...")
	@Pattern(regexp = "^[A-Z][A-Za-z]*$", message = "First letter must be in capital...")
	@Pattern(regexp = "^[A-Z][A-Za-z]*$", message = "Enter valid first name...")
	private String firstName;
	
	@NotEmpty(message = "Enter the last name...")
	@Size(min = 2, message = "Minimum length of last name is 2...")
	@Size(max = 10, message = "Maximum length of last name is 100...")
	@Pattern(regexp = "^[A-Z][A-Za-z]*$", message = "First letter must be in capital...")
	@Pattern(regexp = "^[A-Z][A-Za-z]*$", message = "Enter valid last name...")
	private String lastName;
	
	@NotEmpty(message = "Enter the mobile number...")
	@Size(min = 10,max = 10 , message = "Mobile number length is 10...")
	@Pattern(regexp = "[6-9]{1}[0-9]{9}", message = "Enter valid mobile number...")
	private String phoneNumber;
	
	private String project;
	
//	@NotEmpty(message = "Enter the mode of workId...")
//	@Pattern(regexp = "[1|2|3]", message = "Choose workId 1/2/3...")
	private ModeOfWork modeOfWorkId;
	private String profilePictureFileName;
	private String profilePictureFilePath;
	private Designation designationId;
//	private SeatConfiguration seatConfigurationId;
}
