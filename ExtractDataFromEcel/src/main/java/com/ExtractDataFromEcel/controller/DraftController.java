package com.ExtractDataFromEcel.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ExtractDataFromEcel.service.Draft_DetailsService;

@CrossOrigin
@RestController
public class DraftController {
	
	@Autowired
	Draft_DetailsService service;
	
	@PostMapping(value = "/draft_details")
	  public ResponseEntity<String> uploadFile(@RequestParam("filePath") String filePath) {
		 try {
			 service.extractDataAndStore(filePath);
	            return ResponseEntity.ok("Data extracted and stored successfully.");
	        } catch (IOException e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
	        }
	    }

}
