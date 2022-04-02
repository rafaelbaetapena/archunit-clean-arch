package com.rafaelbaetapena.archunit.entrypoint.rest.input;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;

public class CreateBookRequest {
    private String name;
    private String publishingCompany;

    public CreateBookRequest(String name, String publishingCompany) {
        this.name = name;
        this.publishingCompany = publishingCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public CreateBookCommand toCommand(){
        return new CreateBookCommand(this.name, this.publishingCompany);
    }
}
