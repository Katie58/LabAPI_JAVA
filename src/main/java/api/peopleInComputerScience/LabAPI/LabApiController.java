package api.peopleInComputerScience.LabAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import api.peopleInComputerScience.LabAPI.model.CompletePerson;
import api.peopleInComputerScience.LabAPI.model.TinyPerson;

@Controller
public class LabApiController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/tiny")
	public ModelAndView tiny() {
		List<TinyPerson> tiny = apiService.getTinyPeople();
		return new ModelAndView("tiny", "tiny", tiny);
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<CompletePerson> complete = apiService.getCompletePeople();
		return new ModelAndView("complete", "complete", complete);
	}
	
}
