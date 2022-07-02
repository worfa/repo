package com.hackathon.game.projection.heroProjection;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.entity.HeroClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "heroClass",
        types = {HeroClass.class})
public interface HeroClassView {

    @Value("#{target.id}")
    Long getId();

    String getNameClass();
}
