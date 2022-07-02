package com.hackathon.game.service;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.model.HeroModel;
import com.hackathon.game.repository.HeroClassRepository;
import com.hackathon.game.repository.HeroGuildRepository;
import com.hackathon.game.repository.HeroRaceRepository;
import com.hackathon.game.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HeroService {

    private final HeroClassRepository heroClassRepository;
    private final HeroGuildRepository heroGuildRepository;
    private final HeroRaceRepository heroRaceRepository;
    private final HeroRepository heroRepository;
    private final ModelMapper modelMapper;

    public void create(HeroModel heroModel) {

        Hero hero = modelMapper.map(heroModel, Hero.class);
        hero.setHeroGuild(heroGuildRepository.findById(heroModel.getIdGuild()).orElse(null));
        hero.setHeroRace(heroRaceRepository.findById(heroModel.getIdRace()).orElse(null));
        hero.setHeroClass(heroClassRepository.findById(heroModel.getIdHeroClass()).orElse(null));
        heroRepository.saveAndFlush(hero);
    }
}
