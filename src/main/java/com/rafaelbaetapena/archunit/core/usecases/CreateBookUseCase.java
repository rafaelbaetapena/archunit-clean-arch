package com.rafaelbaetapena.archunit.core.usecases;

import com.rafaelbaetapena.archunit.core.domain.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.domain.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.domain.models.Book;
import com.rafaelbaetapena.archunit.core.ports.in.CreateBookPortIn;
import com.rafaelbaetapena.archunit.core.ports.out.CreateBookPortOut;
import org.springframework.stereotype.Service;

@Service
public class CreateBookUseCase implements CreateBookPortIn {

    private final CreateBookPortOut createBookPortOut;

    public CreateBookUseCase(CreateBookPortOut createBookPortOut) {
        this.createBookPortOut = createBookPortOut;
    }

    @Override
    public Book create(CreateBookCommand command) {
        var bookCreated = createBookPortOut.create(command);
        createBookPortOut.sendEvent(BookCreatedEvent.fromModel(bookCreated));
        return bookCreated;
    }
}
