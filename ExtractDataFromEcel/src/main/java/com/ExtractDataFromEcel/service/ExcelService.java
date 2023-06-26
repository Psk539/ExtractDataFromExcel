package com.ExtractDataFromEcel.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ExtractDataFromEcel.model.Tutorial;

public interface ExcelService {
	public void extractDataAndStore(String filePath) throws IOException;
}
