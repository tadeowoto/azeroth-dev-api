package com.example.azerothapi.model;

public class Chapter {

    private Long id;
    private Long path_id;
    private String title;
    private Integer position;

    public Chapter(Long id, Long path_id, String title, Integer position) {
        this.id = id;
        this.path_id = path_id;
        this.title = title;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPath_id() {
        return path_id;
    }

    public void setPath_id(Long path_id) {
        this.path_id = path_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
