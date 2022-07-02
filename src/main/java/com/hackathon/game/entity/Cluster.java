package com.hackathon.game.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


/**
 * Класс, описывающий группировки (кластеры) изменяемых свойств (MutableProperty)
 * */
@Entity
@Data
@Table(name = "mp_cluster")
public class Cluster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_cluster")
    private String nameCluster;

    @Column(name = "definition")
    private String definition;

    @OneToMany(mappedBy = "cluster", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MutableProperty> properties;

}