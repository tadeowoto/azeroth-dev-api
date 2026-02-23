package com.example.azerothapi.controller;
import com.example.azerothapi.model.Path;
import com.example.azerothapi.service.PathService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/path")
public class PathController {


    private final PathService service;

    @GetMapping
    public ResponseEntity<List<Path>> listPaths(){
        List<Path> path = service.listarPath();
        return ResponseEntity.ok(path);
    }

    @GetMapping("/{slug}")
    public ResponseEntity<Path> findPathBySlug(@PathVariable String slug) {
        return service.buscarPorSlug(slug)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }




}
