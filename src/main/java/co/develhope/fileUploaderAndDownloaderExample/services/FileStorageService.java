package co.develhope.fileUploaderAndDownloaderExample.services;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileStorageService {

    @Value("${fileRepositoryFolder}")
    private String fileRepositoryFolder;

    /**
     * @param file from upload controller
     * @return new file with extension
     * @throws IOException if field is not writable
     */
    public String upload(MultipartFile file) throws IOException {
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        String newFileName = UUID.randomUUID().toString();
        String completeFileName = newFileName + "." + extension;
        //Verifications on the repository folder
        File finalFolder = new File(fileRepositoryFolder);
        if(!finalFolder.exists()) throw new IOException("Final folder does not exists");
        if(!finalFolder.isDirectory()) throw new IOException("Final folder is not a directory");

        File finalDestination = new File(fileRepositoryFolder + "\\" + completeFileName);
        if(finalDestination.exists()) throw new IOException("File conflict");

        file.transferTo(finalDestination);
        return completeFileName;
    }

    public void download(){

    }
}
