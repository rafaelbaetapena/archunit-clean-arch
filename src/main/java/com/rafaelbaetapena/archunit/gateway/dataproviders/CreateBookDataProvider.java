package com.rafaelbaetapena.archunit.gateway.dataproviders;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.events.BookCreatedEvent;
import com.rafaelbaetapena.archunit.core.models.Book;
import com.rafaelbaetapena.archunit.core.ports.CreateBookPort;
import com.rafaelbaetapena.archunit.gateway.postgres.entities.BookEntity;
import com.rafaelbaetapena.archunit.gateway.postgres.repositories.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateBookDataProvider implements CreateBookPort {

    private final BookRepository repository;

    public CreateBookDataProvider(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book create(CreateBookCommand command) {
        var bookCreated = repository.save(BookEntity.fromCommand(command));
        return bookCreated.toModel();
    }

    @Override
    public void sendEvent(BookCreatedEvent event) {
        System.out.println(event);
    }
}
