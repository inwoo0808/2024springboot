package com.sample.spring.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sample.spring.Domain.FileEntity;
import com.sample.spring.repository.FileDataRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class FileDataService {
	
	private final String FOLDER_PATH = "c:\\images\\";
	private final FileDataRepository fileDataRepository;
	
	
	public String uploadImageToFileSystem(MultipartFile file) throws IOException {
		log.info("upload file: " + file.getOriginalFilename());
		
		String filePath = FOLDER_PATH + file.getOriginalFilename();
		
		FileEntity filedata = fileDataRepository.save(
				FileEntity.builder()
				.name(file.getOriginalFilename())
				.type(file.getContentType())
				.filePath(filePath)
				.build()
				);
		
		file.transferTo(new File(filePath));
		
		if(filePath != null) {
			return "file upload success!!! " + filePath;
		}
		
		return null;
	}


	public byte[] downloadImageFileSystem(Long id) throws IOException {
		FileEntity fileData = fileDataRepository.findById(id).orElseThrow();
		
		String filePath = fileData.getFilePath();
		
		log.info("download fileData : " + filePath);
		
		return Files.readAllBytes(new File(filePath).toPath());
	}

	public List<FileEntity> findAll() {
		return fileDataRepository.findAll();
	}
	
	
}
