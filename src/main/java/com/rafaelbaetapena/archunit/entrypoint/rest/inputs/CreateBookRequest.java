package com.rafaelbaetapena.archunit.entrypoint.rest.inputs;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;

public class CreateBookRequest {
    private String title;
    private String publishingCompany;

    public CreateBookRequest(String title, String publishingCompany) {
        this.title = title;
        this.publishingCompany = publishingCompany;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public CreateBookCommand toCommand(){
        return new CreateBookCommand(this.title, this.publishingCompany);
    }
}
