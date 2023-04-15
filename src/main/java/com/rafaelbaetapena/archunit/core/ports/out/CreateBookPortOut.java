package com.rafaelbaetapena.archunit.core.ports.out;

import com.rafaelbaetapena.archunit.core.domain.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.domain.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.domain.models.Book;

public interface CreateBookPortOut {
    Book create(CreateBookCommand command);
    void sendEvent(BookCreatedEvent event);
}
