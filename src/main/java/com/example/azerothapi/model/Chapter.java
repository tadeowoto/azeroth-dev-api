package com.example.azerothapi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@Table(name = "chapters")
@NoArgsConstructor
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "path_id")
    @JsonIgnoreProperties("chapters")
    private Path path;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "sort_order")
    private int position;

}
