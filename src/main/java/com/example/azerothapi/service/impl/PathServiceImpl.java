package com.example.azerothapi.service.impl;

import com.example.azerothapi.model.Path;
import com.example.azerothapi.repository.PathRepository;
import com.example.azerothapi.service.PathService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PathServiceImpl implements PathService {

    private final PathRepository repository;

    @Override
    public List<Path> listarPath() {
        return repository.findAll();
    }

    @Override
    public Optional<Path> buscarPorSlug(String slug) {
        return repository.findBySlug(slug);
    }

}
