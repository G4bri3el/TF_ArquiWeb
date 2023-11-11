package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.serviceinterfaces.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

@RestController
@RequestMapping("/media")
@AllArgsConstructor
public class MediaController {
    private final StorageService storageService;
    private final HttpServletRequest request;

    @PostMapping("/upload")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public Map<String, String> upload(@RequestParam("file")MultipartFile multipartFile){
        String path = storageService.store(multipartFile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/media/")
                .path(path)
                .toUriString();

        return  Map.of("url", url);
    }

    @GetMapping("/{filename:.+}")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException {
        Resource file = storageService.load(filename);
        String contentType = Files.probeContentType(file.getFile().toPath());
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }


}
