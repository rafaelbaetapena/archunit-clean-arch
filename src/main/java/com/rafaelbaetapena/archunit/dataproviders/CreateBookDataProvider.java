package com.rafaelbaetapena.archunit.dataproviders;

import com.rafaelbaetapena.archunit.core.domain.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.domain.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.domain.models.Book;
import com.rafaelbaetapena.archunit.core.ports.out.CreateBookPortOut;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateBookDataProvider implements CreateBookPortOut {

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
