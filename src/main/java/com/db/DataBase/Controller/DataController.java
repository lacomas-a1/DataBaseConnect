package com.db.DataBase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.db.DataBase.Service.DataService;

@Controller
public class DataController {
	
	private DataService dataService;

	public DataController(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	//handler method to handle the list of students and return mode for view
	
	@GetMapping("/index")
	public String ListStudents(Model model) {
		model.addAttribute("students", dataService.getAllStudentModels());
		return "index";
		
	}

}
