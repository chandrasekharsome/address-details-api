package com.sriteja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sriteja.model.AddressDetails;

@Repository

public interface AddressRepository<CompanyDetails> extends JpaRepository<AddressDetails, Integer> {
	
	////JPQL(Java Persistence Query Language)
	@Query(value = "select * from address c where c.village = :village", nativeQuery = true)
	AddressDetails FindByVillage(@Param("village")String village);

	AddressDetails findByVillage(String village);

	
}
