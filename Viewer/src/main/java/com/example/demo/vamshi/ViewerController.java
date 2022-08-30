package com.example.demo.vamshi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ViewerController {
	@Autowired
	UserRepo u;
	@RequestMapping("/")
	public void ResumeDetails()
	{
		User user=new User();
		user.setFullname("Laxmi Sai Vamshi");
		user.setLastname("Kalva");
		user.setAddress("Hyderabad");
		user.setCertificate_1("Machine Learning for Engineering and Science(NPTEL)");
		user.setCertificate_2("Oracle Java SE 8 Programmer");
		user.setCertificate_3("Programming and Problem Solving through C(NPTEL)");
		user.setDegree("Keshav Memorial insitute of technology");
		user.setDegree_year("2016 - 2022");
		user.setEmail("saivamshikalva2000@gmail.com");
		user.setExp_years("2021-Present");
		user.setExperience_1("Virtusa");
		user.setInterests("Cricket , Movies");
		user.setIntermediate("Sri Chaitanya College");
		user.setIntermediate_year("2016 - 2018");
		user.setLanguages("English, Telugu, Hindi");
		user.setMobile("9989998988");
		user.setProfession("Employee");
		user.setProject_1("Creating Rest API for CRUD operations (Micro Project).");
		user.setProject_2("Inventory Management System (Micro Project).");
		user.setProject_3("California House Price Prediction using Machine Learning.");
		user.setProject_4("Web Application to Buy and Sell Books using React and Spring(Major Project)");
		user.setProject_5("Hiring Rate Web Application using React");
		user.setSchool("Bhrungy International School");
		user.setSchool_year("2015 - 2016");
		user.setSkills("JAVA ,C, CPP, PYTHON, REACT, MYSQL, HTML, CSS");
		user.setUserdesc("Work for an organization which provides me the opportunity to improve my skills and knowledge to grow along with the organization objective.");
		u.save(user);
	}
	@RequestMapping("/update/{fullname}/{email}/{mobile}")
	public void updateDetails(@PathVariable String fullname,@PathVariable String email,@PathVariable String mobile)
	{
		User ur=u.getByEmail("saivamshikalva2000@gmail.com");
		
		ur.setEmail(email);
		ur.setFullname(fullname);
		ur.setMobile(mobile);
		u.save(ur);
	}
	@RequestMapping("/index")
	public String index()
	{
		System.out.println("hi");
		return "index.html";
	}
	@GetMapping("/getDetails")
	public User getDetails()
	{
		User ur=u.getByEmail("saivamshikalva2000@gmail.com");
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("student",ur);
//		System.out.println(ur.getFullname());
		
		return ur;
	}
}
