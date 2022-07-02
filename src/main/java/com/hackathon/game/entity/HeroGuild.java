package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@Table(name = "hero_guild")
public class HeroGuild {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "name_guild")
    private String nameGuild;

    public HeroGuild(String nameGuild) {
        this.nameGuild = nameGuild;
    }
}