package com.thiendo.service;

import com.thiendo.entity.File;
import com.thiendo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service(value = "fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileRepository fileRepository;
    @Override
    public File store(MultipartFile file) throws IOException {
        File f = new File();
        f.setName(file.getOriginalFilename());
        f.setContent(file.getBytes());
        f.setType(file.getContentType());

        return fileRepository.save(f);
    }

    @Override
    public List<File> getFiles() {
        return (List<File>) fileRepository.findAllByOrderByIdDesc();
    }

    @Override
    public File getFileById(long id) {
        return fileRepository.findById(id).get();
    }
}
