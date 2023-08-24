package DTO.sample.DTOnew_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Staff")
public class DTO_Entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int IDNo;
	private String Name;
	private String Designation;
	private int Salary;
	private String Location;
	
	public int getIDNo() {
		return IDNo;
	}
	public void setIDNo(int iDNo) {
		IDNo = iDNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	

	

}
