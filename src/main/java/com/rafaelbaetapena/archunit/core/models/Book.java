package com.rafaelbaetapena.archunit.core.models;

import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private String publishingCompany;

    public Book(UUID id, String title, String publishingCompany) {
        this.id = id;
        this.title = title;
        this.publishingCompany = publishingCompany;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }
}
