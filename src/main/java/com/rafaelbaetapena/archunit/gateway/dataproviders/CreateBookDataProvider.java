package com.rafaelbaetapena.archunit.gateway.dataproviders;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.models.Book;
import com.rafaelbaetapena.archunit.core.ports.CreateBookPort;
import org.springframework.stereotype.Component;

@Component
public class CreateBookDataProvider implements CreateBookPort {
    @Override
    public Book create(CreateBookCommand command) {
        return null;
    }

    @Override
    public void sendEvent(BookCreatedEvent event) {

    }
}
