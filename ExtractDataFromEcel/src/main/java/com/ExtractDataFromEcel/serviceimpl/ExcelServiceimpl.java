package com.ExtractDataFromEcel.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExtractDataFromEcel.model.Tutorial;
import com.ExtractDataFromEcel.repo.TutorialRepo;
import com.ExtractDataFromEcel.service.ExcelService;

@Service
public class ExcelServiceimpl implements ExcelService {
@Autowired
TutorialRepo repo;
	@Override
	public void extractDataAndStore(String filePath) throws IOException {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
        
        for (Row row : sheet) {
            // Skip header row if needed
            if (row.getRowNum() == 0) {
                continue;
            }
            
            // Create a new instance of your entity class and populate its fields from the Excel row
            Tutorial entity = new Tutorial();
            entity.setId((long) row.getCell(0).getNumericCellValue());
            entity.setTitle(row.getCell(1).getStringCellValue());
            entity.setDescription(row.getCell(1).getStringCellValue());
            entity.setPublished(row.getCell(1).getStringCellValue());
            // Set other fields
            
            // Save the entity to the database
            repo.save(entity);
        }
        
        workbook.close();
        file.close();
    }
}
