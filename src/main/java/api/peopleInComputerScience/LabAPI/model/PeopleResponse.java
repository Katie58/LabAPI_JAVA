package api.peopleInComputerScience.LabAPI.model;

import java.util.List;

public class PeopleResponse {

	private List<CompletePerson> complete;
	private List<TinyPerson> tiny;
	
	public void setCompletePeople(List<CompletePerson> complete) {
		this.complete = complete;
	}
	
	public void setTiny(List<TinyPerson> tiny) {
		this.tiny = tiny;
	}
	
	public List<CompletePerson> getComplete() {
		return complete;
	}
	
	public List<TinyPerson> getTiny() {
		return tiny;
	}
	
	@Override
	public String toString() {
		return "PeopleResponse [completePeople=" + complete + ", tinyPeople=" + tiny + "]";
	}
	
}
