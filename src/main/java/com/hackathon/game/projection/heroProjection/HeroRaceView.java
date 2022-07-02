package com.hackathon.game.projection.heroProjection;

import com.hackathon.game.entity.HeroClass;
import com.hackathon.game.entity.HeroRace;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "heroRace",
        types = {HeroRace.class})
public interface HeroRaceView {

    @Value("#{target.id}")
    Long getId();

    String getRaceName();
}
