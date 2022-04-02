package com.rafaelbaetapena.archunit.gateway.dataproviders;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.models.Book;
import com.rafaelbaetapena.archunit.core.ports.CreateBookPort;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateBookDataProvider implements CreateBookPort {
    @Override
    public Book create(CreateBookCommand command) {
        System.out.println(command);
        return new Book(
                UUID.randomUUID(),
                command.getName(),
                command.getPublishingCompany()
        );
    }

    @Override
    public void sendEvent(BookCreatedEvent event) {
        System.out.println(event);
    }
}
