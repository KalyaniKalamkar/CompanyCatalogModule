package com.Company.CatalogModule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


	@Repository
	public interface CompanyRepository extends JpaRepository<CompanyEntity,Integer>
	{
		

	}

