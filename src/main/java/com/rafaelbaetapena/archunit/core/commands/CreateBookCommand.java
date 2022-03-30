package com.rafaelbaetapena.archunit.core.commands;

public class CreateBookCommand {
    private String name;
    private String publishingCompany;

    public CreateBookCommand(String name, String publishingCompany) {
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
}
