package com.hackathon.game.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity-класс, enum, справочник изменяемых свойств (MutableProperty)
 * */
@Entity
@Data
@Table(name = "mp_enum")
@NoArgsConstructor
public class PropertyDefinition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_enum")
    private String nameEnum;

    @Column(name = "sqn_mut_prop")
    private Long sqnMutProp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mutable_properties_sqn" /*,nullable = false*/)
    private Property properties;

    public PropertyDefinition(String nameEnum) {
        this.nameEnum = nameEnum;
    }
}