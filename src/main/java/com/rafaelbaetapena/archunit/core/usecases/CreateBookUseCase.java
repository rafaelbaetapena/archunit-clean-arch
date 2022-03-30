package com.rafaelbaetapena.archunit.core.usecases;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.models.Book;

public interface CreateBookUseCase {
    Book create(CreateBookCommand command);
}
