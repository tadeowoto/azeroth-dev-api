package com.example.azerothapi.model;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {

    private Long id;
    private Long path_id;
    private String title;
    private Integer position;


}
