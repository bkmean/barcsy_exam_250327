package task01.app;

import java.time.LocalDate;

public class Employee {

	private String firstName;
	private String lastName;
	private String userName;
	private LocalDate dateOfBirth;
	private Boolean status;
	
	public Employee(String firstName, String lastName, String userName, LocalDate dateOfBirth, Boolean status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public Boolean getStatus() {
		return status;
	}

	public String getStatusText() {
		return status ? "aktív" :"inaktív";
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
        
        public int getAge(){
            return LocalDate.now().compareTo(dateOfBirth);
            
        }
}
