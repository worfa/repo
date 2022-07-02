package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "hero")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "hero_name")
    private String heroName;

    @Column(name = "avatar_hero")
    private String avatarHero;

    @Column(name = "about")
    private String about;

    @Column(name = "date_reg")
    private LocalDate dateReg;

    @Column(name = "sqn_guild")
    private Long sqnGuild;

    @OneToOne
    @JoinColumn
    private HeroClass heroClass;

    @Column(name = "sqn_race")
    private Long sqnRace;
}