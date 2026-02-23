package com.example.azerothapi.repository;
import com.example.azerothapi.model.Path;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PathRepository extends JpaRepository<Path, Long> {


    Optional<Path> findBySlug(String slug);



}
