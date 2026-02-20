package com.example.azerothapi.model;




public class Resource {
    public enum ContentType{
        VIDEO, MARKDOWN, NOTE, LINK
    }

    private Long id;
    private Long chapter_id;
    private String title;
    private ContentType content_type;
    private String text;

    public Resource(Long id, Long chapter_id, String title, ContentType content_type, String text) {
        this.id = id;
        this.chapter_id = chapter_id;
        this.title = title;
        this.content_type = content_type;
        this.text = text;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(Long chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ContentType getContent_type() {
        return content_type;
    }

    public void setContent_type(ContentType content_type) {
        this.content_type = content_type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
