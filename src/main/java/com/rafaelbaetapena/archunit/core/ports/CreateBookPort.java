package com.rafaelbaetapena.archunit.core.ports;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.models.Book;

public interface CreateBookPort {
    Book create(CreateBookCommand command);
    void sendEvent(BookCreatedEvent event);
}
