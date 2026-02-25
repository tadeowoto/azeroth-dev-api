package com.example.azerothapi.service;

import com.example.azerothapi.model.Resource;

import java.util.List;

public interface ResourceService {

    List<Resource> buscarRecursosPorCapituloId(Long id);
}
