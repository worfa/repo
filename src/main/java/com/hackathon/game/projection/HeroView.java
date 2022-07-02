package com.hackathon.game.projection;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.entity.HeroClass;
import com.hackathon.game.entity.HeroGuild;
import com.hackathon.game.entity.HeroRace;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "heroView", types = {Hero.class})
public interface HeroView {

    @Value("#{target.id}")
    Long getId();

    String getHeroName();

    String getAvatarHero();

    String getAbout();

    LocalDate getDateReg();

    HeroRace getHeroRace();

    HeroGuild getHeroGuild();

    HeroClass getHeroClass();

    Hero getHero();
}
