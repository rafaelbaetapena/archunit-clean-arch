package com.rafaelbaetapena.archunit.gateway.postgres;

import com.rafaelbaetapena.archunit.core.commands.CreateBookCommand;
import com.rafaelbaetapena.archunit.core.models.Book;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "publishing_company")
    private String publishingCompany;

    BookEntity() {}

    public BookEntity(UUID id, String title, String publishingCompany) {
        this.id = id;
        this.title = title;
        this.publishingCompany = publishingCompany;
    }

    public static BookEntity fromCommand(CreateBookCommand command) {
        var book = new BookEntity();
        book.title = command.getTitle();
        book.publishingCompany = command.getPublishingCompany();
        return book;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Book toModel() {
        return new Book(
                this.id,
                this.title,
                this.publishingCompany
        );
    }
}
