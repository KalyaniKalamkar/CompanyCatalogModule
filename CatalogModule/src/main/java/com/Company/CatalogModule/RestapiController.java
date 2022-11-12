package com.Company.CatalogModule;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kalyani/api")
public class RestapiController
{
	@Autowired
	private CompanyRepository comrepo;
	
	@GetMapping("/test")
	public  String getMess()
	{
		return "welcome to world";
	}
	
	@GetMapping("com/all")
	public List<CompanyEntity> getAllComp()
	{
		List<CompanyEntity> list=comrepo.findAll();
		return list;
	}
	
	@GetMapping("/com/search/{cid}")
	public CompanyEntity getSearchInfo(@PathVariable int cid)
	{
		CompanyEntity obj;
		
		try {
		Optional<CompanyEntity> opt=comrepo.findById(cid);
		obj=opt.get();
		}
		catch(Exception e)
		{
			obj=new CompanyEntity();
			obj.setCid(0);
			obj.setCnm("not found");
			obj.setFounded(0000);
			obj.setCategory("not found");
			obj.setCountry("not found");
			obj.setEmpno(0);
		}
		return obj;
		
		
	}
	
	@GetMapping("/com/add")
	public CompanyEntity addComp(CompanyEntity obj)
		{
			comrepo.save(obj);
			return obj;
		}
	
	
	
}
