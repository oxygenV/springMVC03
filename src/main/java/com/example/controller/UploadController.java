package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    //批量上传文件
    @RequestMapping("/upload")
        public String getFile(@RequestParam("file") MultipartFile[] file,
                              @RequestParam(value = "desc",required = false) String desc) throws IOException {
        System.out.println(desc);
        for (MultipartFile multipartFile : file) {
            if(!multipartFile.isEmpty()){
                System.out.println(multipartFile.getOriginalFilename());
                multipartFile.transferTo(new File("d:\\file\\"+multipartFile.getOriginalFilename()));
            }
        }
        return "success";
    }
}
