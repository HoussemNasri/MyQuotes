package com.example.myquotes.service.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Quote {
    @SerializedName("_id")
    private String id;
    private String[] tags;
    private String content;
    private String author;
    private Integer length;

    public Quote(String id, String[] tags, String content, String author, Integer length) {
        this.id = id;
        this.tags = tags;
        this.content = content;
        this.author = author;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", tags=" + Arrays.toString(tags) +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", length=" + length +
                '}';
    }
}
