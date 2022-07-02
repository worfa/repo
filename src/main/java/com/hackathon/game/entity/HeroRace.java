package com.hackathon.game.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "hero_race")
@NoArgsConstructor
public class HeroRace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_race")
    private String raceName;

    public HeroRace(String raceName) {
        this.raceName = raceName;
    }
}