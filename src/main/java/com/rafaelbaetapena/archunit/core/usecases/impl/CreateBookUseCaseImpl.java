package com.rafaelbaetapena.archunit.core.usecases.impl;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.models.Book;
import com.rafaelbaetapena.archunit.core.ports.CreateBookPort;
import com.rafaelbaetapena.archunit.core.usecases.CreateBookUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateBookUseCaseImpl implements CreateBookUseCase {

    private final CreateBookPort createBookPort;

    public CreateBookUseCaseImpl(CreateBookPort createBookPort) {
        this.createBookPort = createBookPort;
    }

    @Override
    public Book create(CreateBookCommand command) {
        var bookCreated = createBookPort.create(command);
        createBookPort.sendEvent(BookCreatedEvent.fromModel(bookCreated));
        return bookCreated;
    }
}
