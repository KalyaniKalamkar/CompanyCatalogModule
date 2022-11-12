package com.Company.CatalogModule;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class JpaController {
	
	@Autowired
	private CompanyRepository comrepo;
	
	@RequestMapping("/companydetails")
	public String companyDetails()
	{
		
		return "CompanyDetails";
		
	}
	@RequestMapping("/addacc")
	public String addAcc(CompanyEntity obj)
	{
		comrepo.save(obj);
		return "RegSucc";
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteAcc(int cid)
	{
		comrepo.deleteById(cid); 
		ModelAndView mv=new ModelAndView();
		mv.setViewName("RegSucc");
		return mv;
		
//		System.out.println("Account Deleted");

	}
	
	@RequestMapping("/report")
	public ModelAndView report()
	{
		ModelAndView mv=new ModelAndView();
		List<CompanyEntity> list=comrepo.findAll();
		mv.addObject("list",list);
		mv.setViewName("Report");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateAcc(int cid, int empno)
	{
		Optional<CompanyEntity> opt=comrepo.findById(cid);
		CompanyEntity obj=opt.get();
		obj.setEmpno(empno);
		comrepo.save(obj);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("RegSucc");
		return mv;
		//System.out.println("Account Updated");
		
	}
	
	@RequestMapping("/searchacc")
	public ModelAndView searchAcc(int cid)
	{
		Optional<CompanyEntity> opt=comrepo.findById(cid);
		CompanyEntity obj=opt.get();
		ModelAndView mv=new ModelAndView();
		mv.addObject("ac",obj);
		mv.setViewName("SearchResult");
		return mv;
		//System.out.println(obj.getAccnm());
		//return "SearchResult";
	}

}
