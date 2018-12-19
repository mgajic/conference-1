package com.prodyna.pac.conference.frontend.entity;

import lombok.*;
import uk.co.blackpepper.bowman.annotation.LinkedResource;
import uk.co.blackpepper.bowman.annotation.RemoteResource;
import uk.co.blackpepper.bowman.annotation.ResourceId;

import java.net.URI;
import java.util.Set;

@Data
@RemoteResource("/api/location")
public class Location extends AbstractEntity {

    private String name;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Room> rooms;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Event> events;

    @LinkedResource
    public Set<Room> getRooms() {
        return rooms;
    }

    @LinkedResource
    public Set<Event> getEvents() {
        return events;
    }
}