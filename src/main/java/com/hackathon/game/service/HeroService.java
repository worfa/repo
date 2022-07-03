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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

//    public HeroClusterModel getHeroCluster(Long heroId) {
//        Hero hero = heroRepository.findById(heroId).orElse(null);
//        List<PropertyValue> propertyValues = propertyValueRepository.getByHeroAndActualityFlag(heroId, true);
//        List<Property> properties = propertyValues.stream()
//                .filter(propertyValue -> propertyValue.getHero().getId() == hero.getId())
//                .map(propertyValue -> propertyValue.getProperty()).collect(Collectors.toList());
//
////        List<Cluster> clusters = clusterRepository.findClustersForUser(properties);
//
//        Map<Long, List<Property>> mapCluster = new HashMap<>();
//
//        for(Long i = 0L; i < mapCluster.size(); i++) {
//            List<Property> propertyList = mapCluster.get(i);
//            Long finalI = i;
//            properties.stream().filter(property -> property.getCluster().getId() == finalI).forEach(property -> propertyList.add(property));
//            mapCluster.put(i, propertyList);
//        }

//        clusters.forEach(cluster -> cluster.setProperties(mapCluster.get(cluster.getId())));
//
//        HeroClusterModel heroClusterModel = new HeroClusterModel();
//        heroClusterModel.setClusters(clusters);
//        heroClusterModel.setNameHeroClass(hero.getHeroClass().getNameClass());
//        heroClusterModel.setAvatarHero(hero.getAvatarHero());
//        heroClusterModel.setHeroName(hero.getHeroName());
//        heroClusterModel.setAbout(hero.getAbout());
//        heroClusterModel.setDateReg(hero.getDateReg());
//        heroClusterModel.setNameGuild(hero.getHeroGuild().getNameGuild());
//        heroClusterModel.setNameRace(hero.getHeroRace().getRaceName());
//
//        return heroClusterModel;
//    }
}
