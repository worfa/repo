package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

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
    private MpCluster sqnCluster;

    @Column(name = "name_prop")
    @Type(type = "org.hibernate.type.TextType")
    private String nameProp;

    @Column(name = "typeof_mp")
    @Type(type = "org.hibernate.type.TextType")
    private String typeofMp;

    @Column(name = "sqn_mp_enum")
    private Long sqnMpEnum;
}