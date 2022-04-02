package com.rafaelbaetapena.archunit.core.events;

import com.rafaelbaetapena.archunit.core.models.Book;

import java.util.UUID;

public class BookCreatedEvent {
    private UUID id;

    public BookCreatedEvent(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public static BookCreatedEvent fromModel(Book book){
        return  new BookCreatedEvent(book.getId());
    }
}
