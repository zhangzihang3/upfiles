package com.zzh.demo.service;

import org.springframework.web.multipart.MultipartFile;

public interface fileI {
    public Boolean saveFile(MultipartFile multipartFile);
}
