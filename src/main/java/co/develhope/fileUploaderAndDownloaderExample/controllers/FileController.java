package co.develhope.fileUploaderAndDownloaderExample.controllers;

import co.develhope.fileUploaderAndDownloaderExample.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileStorageService fileStorageService;


    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) throws Exception{
        return fileStorageService.upload(file);
    }

    @PostMapping("/download")
    public void download(){

    }


}
