package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "mutable_properties")
public class MutableProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sqn_cluster")
    private Cluster sqnCluster;

    @Column(name = "name_prop")
    private String nameProp;

    @Column(name = "typeof_mp")
    private String typeofMp;

    @Column(name = "sqn_mp_enum")
    private Long sqnMpEnum;

    @OneToMany(mappedBy = "property")
    private List<PropertyValue> propertyValues;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cluster_sqn", nullable = false)
    private Cluster cluster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "property_definition_sqn", nullable = false)
    private PropertyDefinition propertyDefinition;
}