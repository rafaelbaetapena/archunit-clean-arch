package com.rafaelbaetapena.archunit.entrypoint.rest.controllers;

import com.rafaelbaetapena.archunit.core.usecases.CreateBookUseCase;
import com.rafaelbaetapena.archunit.entrypoint.rest.inputs.CreateBookRequest;
import com.rafaelbaetapena.archunit.entrypoint.rest.outputs.BookCreatedResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    private final CreateBookUseCase createBookUseCase;

    public BookController(CreateBookUseCase createBookUseCase){
        this.createBookUseCase = createBookUseCase;
    }

    @PostMapping
    public BookCreatedResponse create(@RequestBody CreateBookRequest request) {
        var bookCreated = createBookUseCase.create(request.toCommand());
        return BookCreatedResponse.fromDomain(bookCreated);
    }
}
