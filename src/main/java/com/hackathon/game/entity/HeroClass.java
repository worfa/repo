package com.hackathon.game.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@Table(name = "hero_class")
@NoArgsConstructor
public class HeroClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_class")
    private String nameClass;

    public HeroClass(String nameClass) {
        this.nameClass = nameClass;
    }
}