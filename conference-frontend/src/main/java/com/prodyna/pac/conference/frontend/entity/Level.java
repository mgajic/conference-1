package com.prodyna.pac.conference.frontend.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.co.blackpepper.bowman.annotation.LinkedResource;
import uk.co.blackpepper.bowman.annotation.RemoteResource;

import java.util.Set;

@Data
@RemoteResource("/api/levels")
public class Level extends NumericEntity {

    private int id;
    private String name;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Talk> talks;

    @LinkedResource
    public Set<Talk> getTalks() {
        return talks;
    }

}
