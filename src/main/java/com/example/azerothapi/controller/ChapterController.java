package com.example.azerothapi.controller;


import com.example.azerothapi.model.Chapter;
import com.example.azerothapi.service.ChapterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chapter")
public class ChapterController {

    private final ChapterService service;

    @GetMapping("/{id}")
    public ResponseEntity<Chapter> findById (@PathVariable Long id){
        return ResponseEntity.ok(service.buscarChapterPorId(id));
    }
}
