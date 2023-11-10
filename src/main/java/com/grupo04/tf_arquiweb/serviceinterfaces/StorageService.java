package com.grupo04.tf_arquiweb.serviceinterfaces;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface StorageService {
    void init() throws IOException;

    String store(MultipartFile file);
    Resource load(String filename);
}
