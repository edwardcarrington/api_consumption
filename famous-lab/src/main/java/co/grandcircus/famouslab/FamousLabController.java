package co.grandcircus.famouslab;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.Complete;
import co.grandcircus.famouslab.model.Master;
import co.grandcircus.famouslab.model.Tiny;

@Controller
public class FamousLabController {

	@RequestMapping("/complete")
	public ModelAndView showComplete() {
		ModelAndView mav = new ModelAndView("complete");

		// Rest template creation
		RestTemplate restTemplate = new RestTemplate(); // Simplifies method of talking to REST APIs

		// Header setup (not needed for this API)
		// HttpHeaders headers = new HttpHeaders();

		// Making API request here
		ResponseEntity<Master> response = restTemplate.exchange(
				"https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET,
				new HttpEntity<>(null), Master.class);

		// Extract body from response
		Master result = response.getBody();
		List<Complete> complete = result.getComplete();
		Collections.sort(complete, new Comparator<Complete>() {

			@Override
			public int compare(Complete c1, Complete c2) {
				// TODO Auto-generated method stub
				return Integer.compare(c1.getYear(), c2.getYear());
			}
		});

		mav.addObject("completelist", result.getComplete());

		return mav;
	}

	@RequestMapping("/tiny")
	public ModelAndView showTiny() {

		ModelAndView mav = new ModelAndView("tiny");

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Master> response = restTemplate.exchange(
				"https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET,
				new HttpEntity<>(null), Master.class);

		Master result = response.getBody();

		List<Tiny> tinyresult = result.getTiny();
		Collections.sort(tinyresult, new Comparator<Tiny>() {

			@Override
			public int compare(Tiny t1, Tiny t2) {
				// TODO Auto-generated method stub
				return Integer.compare(t1.getYear(), t2.getYear());
			}
		});

		mav.addObject("tinylist", result.getTiny());

		return mav;
	}

}
