package com.rafaelbaetapena.archunit.gateway.dataproviders.postgres.repositories;

import com.rafaelbaetapena.archunit.gateway.dataproviders.postgres.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, UUID> {
}
