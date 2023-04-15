package com.rafaelbaetapena.archunit.gateway.dataproviders;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.models.Book;
import com.rafaelbaetapena.archunit.core.ports.CreateBookPort;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateBookDataProvider implements CreateBookPort {

    public CreateBookDataProvider() {
    }

    @Override
    public Book create(CreateBookCommand command) {
        return new Book(UUID.randomUUID(), "Test 123", "Company");
    }

    @Override
    public void sendEvent(BookCreatedEvent event) {
        System.out.println(event);
    }
}
