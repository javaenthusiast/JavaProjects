package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.Servings;


@Controller
public class ServingsController {

	@RequestMapping(value = "/addServings")
	public String addServings(@ModelAttribute ("servings") Servings servings){
		System.out.println("servings" + servings.getServings());
		return "addServing";
	}
}
