package com.onerivet.DeskBook.model.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "Employee")
public class Employee {
	@Id
	@Column(name = "EmployeeId")
	private int id;
	@Column(name = "UserId")
	private String userId;
	@Column(name = "EmailId")
	private String emailId;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	@Column(name = "Project")
	private String project;
	@OneToOne
	@JoinColumn(name = "ModeOfWorkId")
	private ModeOfWork modeOfWorkId;
	@Column(name = "ProfilePictureFileName")
	private String profilePictureFileName;
	@Column(name = "ProfilePictureFilePath")
	private String profilePictureFilePath;
	@OneToOne
	@JoinColumn(name = "DesignationId")
	private Designation designationId;
//	@OneToOne
//	@JoinColumn(name = "SeatConfigurationId")
//	private SeatConfiguration seatConfigurationId;

	@ManyToMany
	@JoinTable(name = "EmployeeRole",schema = "dbo", joinColumns = { @JoinColumn(name = "EmployeeId") }, inverseJoinColumns = {
			@JoinColumn(name = "RoleId") })
	private Set<Role> role;

	@ManyToMany
	@JoinTable(name = "EmployeeWorkingDays",schema = "dbo", joinColumns = { @JoinColumn(name = "EmployeeId") }, inverseJoinColumns = {
			@JoinColumn(name = "WorkingDayId") })
	private Set<WorkingDay> workingDay;

}
