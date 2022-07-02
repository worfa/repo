package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

/**
 * Entity-класс, enum, справочник изменяемых свойств (MutableProperty)
 * */
@Entity
@Data
@Table(name = "mp_enum")
public class PropertyDefinition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_enum")
    private String nameEnum;

    @Column(name = "sqn_mut_prop")
    private Long sqnMutProp;

    @OneToMany(mappedBy = "property_definition", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MutableProperty> properties;
}