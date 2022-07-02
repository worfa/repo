package com.hackathon.game.service;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.model.HeroModel;
import com.hackathon.game.repository.HeroClassRepository;
import com.hackathon.game.repository.HeroGuildRepository;
import com.hackathon.game.repository.HeroRaceRepository;
import com.hackathon.game.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HeroServiceImpl {

    private final HeroClassRepository heroClassRepository;
    private final HeroGuildRepository heroGuildRepository;
    private final HeroRaceRepository heroRaceRepository;
    private final HeroRepository heroRepository;

    public void create(HeroModel heroModel) {

        Hero hero = convertToEntity(heroModel);
        heroRepository.saveAndFlush(hero);
    }

    private Hero convertToEntity(HeroModel heroModel){

        Hero hero = new Hero();

        hero.setHeroName(heroModel.getHeroName());
        hero.setAvatarHero(heroModel.getAvatarHero());
        hero.setAbout(heroModel.getAbout());
        hero.setDateReg(heroModel.getDateReg());
        hero.setHeroGuild(heroGuildRepository.findById(heroModel.getIdGuild()).orElse(null));
        hero.setHeroRace(heroRaceRepository.findById(heroModel.getIdRace()).orElse(null));
        hero.setHeroClass(heroClassRepository.findById(heroModel.getIdHeroClass()).orElse(null));

        return hero;
    }
}
