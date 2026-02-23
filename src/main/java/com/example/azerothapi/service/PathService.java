package com.example.azerothapi.service;


import com.example.azerothapi.model.Path;
import com.example.azerothapi.model.Tag;

import java.util.List;
import java.util.Optional;

public interface PathService {

    List<Path> listarPath();

    Optional<Path> buscarPorSlug(String slug);


}
