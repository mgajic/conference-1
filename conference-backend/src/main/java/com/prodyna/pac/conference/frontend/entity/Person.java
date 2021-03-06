package com.prodyna.pac.conference.frontend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.neo4j.ogm.annotation.*;

import java.util.Set;

@Data
@NodeEntity
public class Person {

    @Id
    @GeneratedValue
    private Long _id;

    private String id;

    @Index(unique = true)
    private String name;

    @JsonIgnore
    private String hashedPassword;

    @Relationship(type="BY_PERSON",direction=Relationship.INCOMING)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Talk> talks;

    @Relationship(type="WORKS_FOR",direction = Relationship.OUTGOING)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Organization organization;

    @Relationship(type="MEMBER_OF",direction = Relationship.OUTGOING)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Role> roles;

}
