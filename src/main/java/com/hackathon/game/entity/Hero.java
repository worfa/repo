package com.hackathon.game.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "hero")
@NoArgsConstructor
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hero_guild_sqn")
    private HeroGuild heroGuild;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hero_class_sqn", nullable = false)
    private HeroClass heroClass;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "race_sqn", nullable = false)
    private HeroRace heroRace;

    @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PropertyValue> values;

    public Hero(String heroName, String avatarHero, String about, LocalDate dateReg, HeroGuild heroGuild, HeroClass heroClass, HeroRace heroRace) {
        this.heroName = heroName;
        this.avatarHero = avatarHero;
        this.about = about;
        this.dateReg = dateReg;
        this.heroGuild = heroGuild;
        this.heroClass = heroClass;
        this.heroRace = heroRace;
    }
}