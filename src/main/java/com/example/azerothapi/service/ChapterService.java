package com.example.azerothapi.service;


import com.example.azerothapi.model.Chapter;
import java.util.Optional;


public interface ChapterService {

    Chapter buscarChapterPorId(Long id);
}
