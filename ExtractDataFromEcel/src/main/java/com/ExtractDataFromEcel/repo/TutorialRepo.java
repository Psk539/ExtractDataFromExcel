package com.ExtractDataFromEcel.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExtractDataFromEcel.model.Tutorial;
@Repository
public interface TutorialRepo extends JpaRepository<Tutorial, Long> {

}
