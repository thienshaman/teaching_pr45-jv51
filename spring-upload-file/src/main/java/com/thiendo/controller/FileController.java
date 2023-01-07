package com.thiendo.controller;

import com.thiendo.dto.FileResponseDto;
import com.thiendo.entity.File;
import com.thiendo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<FileResponseDto> fileResponseDtos = new ArrayList<>();
        List<File> files = fileService.getFiles();
        files.forEach(file -> {
            String fileUrl = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/file/")
                    .path(String.valueOf(file.getId()))
                    .toUriString();

            FileResponseDto fileResponseDto = new FileResponseDto();
            fileResponseDto.setName(file.getName());
            fileResponseDto.setUrl(fileUrl);

            fileResponseDtos.add(fileResponseDto);
        });

        model.addAttribute("files", fileResponseDtos);

        return "index";
    }

    @RequestMapping(value = "/file/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) {
        try {
            File f = fileService.store(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/file/upload/multiple", method = RequestMethod.POST)
    public String uploadMultiple(@RequestParam("files") MultipartFile[] files) {
        Arrays.asList(files).forEach(file -> {
            try {
                fileService.store(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        return "redirect:/";
    }

    @GetMapping("/file/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {
        File fileDB = fileService.getFileById(Long.parseLong(id));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
                .body(fileDB.getContent());
    }
}
