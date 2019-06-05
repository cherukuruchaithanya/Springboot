package com.example.demo5.Image;

import com.example.demo5.FileStorageException.FileStorageException;
import com.example.demo5.FileStorageException.MyFileNotFoundException;
import com.example.demo5.Image.DBFile;
import com.example.demo5.Image.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;

    public DBFile storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());

            return dbFileRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public DBFile getFile(String fileId) {
        return dbFileRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }

	public void saveImage(MultipartFile imagefile) throws Exception{
		// TODO Auto-generated method stub
		String folder="/photos/";
		byte[] bytes=imagefile.getBytes();
		Path path = Paths.get(folder+imagefile.getOriginalFilename());
		Files.write(path,bytes);
		
		
	}
}