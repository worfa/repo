package com.hackathon.game.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "mutable_properties")
@NoArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_prop")
    private String nameProp;

    @Column(name = "typeof_mp")
    private String typeofMp;

    @Column(name = "sqn_mp_enum")
    private Long sqnMpEnum;

    @OneToMany(mappedBy = "mutableProperty")
    private List<PropertyValue> propertyValues;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cluster_sqn"/*, nullable = false*/)
    private Cluster cluster;

    public Property(String nameProp, String typeofMp, Cluster cluster) {
        this.nameProp = nameProp;
        this.typeofMp = typeofMp;
        this.cluster = cluster;

    }
}