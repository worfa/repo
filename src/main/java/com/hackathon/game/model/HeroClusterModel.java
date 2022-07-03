package com.hackathon.game.model;

import com.hackathon.game.entity.Cluster;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class HeroClusterModel {

    private String heroName;

    private String avatarHero;

    private String about;

    private LocalDate dateReg;

    private String nameGuild;

    private String nameHeroClass;

    private String nameRace;

    private List<Cluster> clusters;
}
