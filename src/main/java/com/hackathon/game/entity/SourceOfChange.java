package com.hackathon.game.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "source_of_change")
public class SourceOfChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_source")
    private String nameSource;

    @ManyToOne
    private Property mutableProperty;
}