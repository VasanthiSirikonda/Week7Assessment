package com.infinite.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.model.Complaint;
import com.infinite.service.ComplaintServiceImpl;

/**
 * @author vasanthis
 *
 */
public class MainController {   // used for both login and insertion
	
	private static final Logger logger= Logger.getLogger(MainController.class);  //logger injection
	@Autowired
	ComplaintServiceImpl cservice;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")  //mapping the incomming request
	public String goToHomePage() {
		return "redirect:/getAllComplaints";
	}

	@RequestMapping(value = "/getAllComplains", method = RequestMethod.GET, headers = "Accept=application/json") // mapping the incomming request
	public String getAllComplains(Model m) {
		m.addAttribute("Complaint", new Complaint());
		m.addAttribute("listOfComplains", cservice.getAllComplaints());
		return "complaint";  
	}

	@RequestMapping(value = "/addComplains", method = RequestMethod.POST, headers = "Accept=application/json")// mapping the incomming request
	public String addComplains(@ModelAttribute("Complaint") Complaint complaint) {
		if (complaint.getId() == 0) {
			cservice.addComplaint(complaint);
		} else {
			cservice.updateComplaint(complaint);
			;
		}
		return "redirect:/getAllComplains";
	}

	@RequestMapping(value = "/updateComplaints/{id}")  // mapping the incomming request
	public String updateComplains(@PathVariable("id") int id, Model model) {
		model.addAttribute("Complaint", this.cservice.getComplaint(id));
		model.addAttribute("listOfComplains", this.cservice.getAllComplaints());
		return "complaint";
	}

	@RequestMapping(value = "/deleteComplaints/{id}", method = RequestMethod.GET, headers = "Accept=application/json")  // mapping the incomming request
	public String deleteComplains(@PathVariable("id") int id) {
		cservice.deleteComplaint(id);
		;
		return "redirect:/getAllComplains";
	}

}
