package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@Table(name = "mp_enum")
public class MpEnum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_enum")
    private String nameEnum;

    @Column(name = "sqn_mut_prop")
    private Long sqnMutProp;
}