package api.peopleInComputerScience.LabAPI.model;

public class TinyPerson {

	private String name;
	private String invented;
	private Integer year;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setInvented(String invented) {
		this.invented = invented;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public String getInvented() {
		return invented;
	}
	
	public Integer getYear() {
		return year;
	}
	
}
