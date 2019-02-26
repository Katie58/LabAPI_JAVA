package api.peopleInComputerScience.LabAPI;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import api.peopleInComputerScience.LabAPI.model.CompletePerson;
import api.peopleInComputerScience.LabAPI.model.PeopleResponse;
import api.peopleInComputerScience.LabAPI.model.TinyPerson;

@Component
public class ApiService {
	
	private RestTemplate restTemplate = new RestTemplate();

	private String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
	

	
	public List<CompletePerson> getCompletePeople() {
		PeopleResponse response = restTemplate.getForObject(url, PeopleResponse.class);
		return response.getComplete();
	}
	
	public List<TinyPerson> getTinyPeople() {
		PeopleResponse response = restTemplate.getForObject(url, PeopleResponse.class);
		return response.getTiny();
	}
	
}
