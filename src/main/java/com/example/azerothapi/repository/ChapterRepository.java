package com.example.azerothapi.repository;
import com.example.azerothapi.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    Optional<Chapter> findById(Long id);
}
