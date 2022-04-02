package com.rafaelbaetapena.archunit.core.commands;

public class CreateBookCommand {
    private String title;
    private String publishingCompany;

    public CreateBookCommand(String title, String publishingCompany) {
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
}
