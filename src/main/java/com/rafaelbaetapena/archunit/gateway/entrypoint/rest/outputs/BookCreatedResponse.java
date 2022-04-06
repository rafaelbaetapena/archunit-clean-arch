package com.rafaelbaetapena.archunit.gateway.entrypoint.rest.outputs;

import com.rafaelbaetapena.archunit.core.models.Book;

import java.util.UUID;

public class BookCreatedResponse {
    private UUID id;
    private String title;
    private String publishingCompany;

    public BookCreatedResponse(UUID id, String title, String publishingCompany) {
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

    public static BookCreatedResponse fromDomain(Book book) {
        return new BookCreatedResponse(
                book.getId(),
                book.getTitle(),
                book.getPublishingCompany()
        );
    }
}
