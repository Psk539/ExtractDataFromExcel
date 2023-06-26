package com.ExtractDataFromEcel.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExtractDataFromEcel.model.Draft_Details;
import com.ExtractDataFromEcel.repo.DraftDetailsRepo;
import com.ExtractDataFromEcel.service.Draft_DetailsService;

@Service
public class Draft_detailsImpl implements Draft_DetailsService {

	@Autowired
	DraftDetailsRepo repo;
	
	@Override
	public void extractDataAndStore(String filePath) throws IOException {
		 FileInputStream file = new FileInputStream(new File(filePath));
	        Workbook workbook = new XSSFWorkbook(file);
	        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
	        
	        for (
	        		
	        		
	        		
	        		Row row : sheet) {
	            // Skip header row if needed
	            if (row.getRowNum() == 0) {
	                continue;
	            }
	            // Create a new instance of your entity class and populate its fields from the Excel row
	            Draft_Details entity = new Draft_Details();
	            entity.setDraftId((Double) row.getCell(0).getNumericCellValue());
	            entity.setAm((Double) row.getCell(1).getNumericCellValue());
	            entity.setAw((Double) row.getCell(2).getNumericCellValue());
	            entity.setDis((Double) row.getCell(3).getNumericCellValue());
	            entity.setDispt((Double) row.getCell(4).getNumericCellValue());
	            entity.setDraft((Double) row.getCell(5).getNumericCellValue());
	            entity.setKb((Double) row.getCell(6).getNumericCellValue());
	            entity.setLcb((Double) row.getCell(7).getNumericCellValue());
	            entity.setLcf((Double) row.getCell(8).getNumericCellValue());
	            entity.setLkm((Double) row.getCell(9).getNumericCellValue());
	            entity.setMtc((Double) row.getCell(10).getNumericCellValue());
	            entity.setOther((Double) row.getCell(11).getNumericCellValue());
	            entity.setShipImoNo((Double) row.getCell(12).getNumericCellValue());
	            entity.setTkm((Double) row.getCell(13).getNumericCellValue());
	            entity.setTpc((Double) row.getCell(14).getNumericCellValue());
	            // Set other fields
	            
	            // Save the entity to the database
	            repo.save(entity);
	        }
	        
	        workbook.close();
	        file.close();
	    }

}
