package com.rafaelbaetapena.archunit.core.ports.in;

import com.rafaelbaetapena.archunit.core.domain.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.domain.models.Book;

public interface CreateBookPortIn {
    Book create(CreateBookCommand command);
}
