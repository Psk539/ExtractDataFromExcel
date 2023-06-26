package com.ExtractDataFromEcel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExtractDataFromEcel.model.Draft_Details;

@Repository
public interface DraftDetailsRepo extends JpaRepository<Draft_Details, Double>{
	

}
