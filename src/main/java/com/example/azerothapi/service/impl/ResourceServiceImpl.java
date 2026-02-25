package com.example.azerothapi.service.impl;


import com.example.azerothapi.model.Resource;
import com.example.azerothapi.repository.ResourceRepository;
import com.example.azerothapi.service.ResourceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repository;

    @Override
    public List<Resource> buscarRecursosPorCapituloId(Long id) {
        return repository.findByChapterId(id);
    }
}
