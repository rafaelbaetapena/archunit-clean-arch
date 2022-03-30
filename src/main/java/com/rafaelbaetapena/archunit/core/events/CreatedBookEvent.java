package com.rafaelbaetapena.archunit.core.events;

import java.util.UUID;

public class CreatedBookEvent {
    private UUID id;

    public CreatedBookEvent(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
