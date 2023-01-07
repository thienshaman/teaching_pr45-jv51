package com.thiendo.service;

import com.thiendo.entity.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    File store(MultipartFile file) throws IOException;
    List<File> getFiles();
    File getFileById(long id);
}
