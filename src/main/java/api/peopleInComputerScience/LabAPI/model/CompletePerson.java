package api.peopleInComputerScience.LabAPI.model;

public class CompletePerson {

	private String firstName;
	private String lastName;
	private String innovation;
	private Integer year;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getInnovation() {
		return innovation;
	}
	
	public Integer getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "PersonComplete [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation
				+ ", year=" + year + "]";
	}
	
}
