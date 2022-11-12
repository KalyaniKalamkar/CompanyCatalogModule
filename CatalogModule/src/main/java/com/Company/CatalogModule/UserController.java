package com.Company.CatalogModule;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@ComponentScan(basePackages={"com.Company.CatalogModule"})
public class UserController {

	@Autowired
	UserOperation opp;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/newuser")
	public String newAcc()
	{
		return "UserInfo";
	}
	
	@RequestMapping("/addinfo")
	public String userDetails(UserModule obj)
	{
		String stat=opp.userInfo(obj);
		String page="";
		if(stat.equals("success"))
			page = "RegSucc";
		else
			page = "RegFail";
					
	
	return page;
	}
	
	@RequestMapping("/check")
	public String accCheck(UserModule obj)
	{
		String stat=opp.checkComInfo(obj);
		String page="";
		if(stat.equals("Customer"))
			page="Customer";
		else if(stat.equals("Admin"))
			page="Admin";
		else 
			page="LoginFailed";
		
		return page;
	}
	
	@RequestMapping("/custreport")
	public ModelAndView custReport()
	{
		ModelAndView mv=new ModelAndView();
		ArrayList<UserModule> lst=opp.custReport();
		mv.addObject("lst",lst);
		mv.setViewName("CustReport");
		return mv;
	}
	
	
}
