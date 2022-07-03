package com.hackathon.game.service;

import com.hackathon.game.entity.Cluster;
import com.hackathon.game.entity.Hero;
import com.hackathon.game.entity.Property;
import com.hackathon.game.entity.PropertyValue;
import com.hackathon.game.model.HeroClassModel;
import com.hackathon.game.model.HeroClusterModel;
import com.hackathon.game.model.HeroModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HeroService {

    private final HeroClassRepository heroClassRepository;
    private final HeroGuildRepository heroGuildRepository;
    private final HeroRaceRepository heroRaceRepository;
    private final HeroRepository heroRepository;
    private final ClusterRepository clusterRepository;
    private final PropertyValueRepository propertyValueRepository;
    private final ModelMapper modelMapper;

    public void create(HeroModel heroModel) {

        Hero hero = new Hero();
        hero.setAvatarHero(heroModel.getAvatarHero());
        hero.setHeroName(heroModel.getHeroName());
        hero.setDateReg(LocalDate.now());
        hero.setAbout(heroModel.getAbout());
        hero.setHeroGuild(heroGuildRepository.findById(heroModel.getIdGuild()).orElse(null));
        hero.setHeroRace(heroRaceRepository.findById(heroModel.getIdRace()).orElse(null));
        hero.setHeroClass(heroClassRepository.findById(heroModel.getIdHeroClass()).orElse(null));
        heroRepository.saveAndFlush(hero);
    }

    public void getHeroCluster(Long heroId) {

        Hero hero = heroRepository.findById(heroId).orElse(null);
        List<PropertyValue> propertyValues = propertyValueRepository.getByHeroAndActualityFlag(hero, true);

    }
}
