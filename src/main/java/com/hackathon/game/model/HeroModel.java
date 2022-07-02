package com.hackathon.game.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HeroModel {

    private String heroName;

    private String avatarHero;

    private String about;

    private LocalDate dateReg;

    private Long idGuild;

    private Long idHeroClass;

    private Long idRace;
}