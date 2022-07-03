package com.hackathon.game.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "mp_values")
public class PropertyValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    @Column(name = "date_begin")
    private LocalDate dateBegin;

    @Column(name = "actuality_flag")
    private Boolean actualityFlag;

    @Column(name = "date_time_value")
    private LocalDate dateTimeValue;

    @Column(name = "number_value")
    private Long numberValue;

    @Column(name = "string_value")
    private String stringValue;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "property_definition_sqn", nullable = false)
    private PropertyDefinition propertyDefinition;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hero_sqn", nullable = false)
    private Hero hero;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mutable_property_sqn", nullable = false)
    private Property property;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_of_change_sqn", nullable = false)
    private SourceOfChange sourceOfChange;

}