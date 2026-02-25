package com.example.azerothapi.controller;
import com.example.azerothapi.model.Resource;
import com.example.azerothapi.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/resource")
public class ResourceController {

    private final ResourceService service;

    @GetMapping("/{idChapter}")
    ResponseEntity<List<Resource>> getResourceByChapterId(@PathVariable  Long idChapter){
        return ResponseEntity.ok(service.buscarRecursosPorCapituloId(idChapter));
    }

}
