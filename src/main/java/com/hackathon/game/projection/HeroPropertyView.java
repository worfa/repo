package com.hackathon.game.projection;

import com.hackathon.game.entity.*;
import com.hackathon.game.projection.clusterProjection.PropertyValueView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "heroPropertyView", types = {Hero.class})
public interface HeroPropertyView {

    @Value("#{target.id}")
    Long getId();

    String getHeroName();

    String getAvatarHero();

    String getAbout();

    LocalDate getDateReg();

    HeroRace getHeroRace();

    HeroGuild getHeroGuild();

    HeroClass getHeroClass();

    List<PropertyValue> getValues();
}
