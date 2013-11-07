package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Challenge;


@Controller
@SessionAttributes("challenge")
public class ChallengeController {

	@RequestMapping(value="addChallenge", method = RequestMethod.GET)
	public String addChallenge (Model model){
		Challenge challenge = new Challenge();
		challenge.setServings(5);
		model.addAttribute("challenge", challenge);
		return "addChallenge";
		
	}
	
	@RequestMapping(value="addChallenge", method = RequestMethod.POST)
	public String updateChallenge (@ModelAttribute("challenge") Challenge challenge){
		System.out.println("Challenge updated is: " + challenge.getServings());
		return "redirect:addServings.html";
		
	}
}
