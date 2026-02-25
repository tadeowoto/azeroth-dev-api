package com.example.azerothapi.service.impl;


import com.example.azerothapi.model.Chapter;
import com.example.azerothapi.repository.ChapterRepository;
import com.example.azerothapi.service.ChapterService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChapterServiceImpl implements ChapterService {

    private final ChapterRepository repository;


    @Override
    public Chapter buscarChapterPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Capítulo con ID " + id + " no encontrado"));
    }
}
