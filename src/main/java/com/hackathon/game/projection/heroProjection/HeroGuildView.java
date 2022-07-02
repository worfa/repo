package com.hackathon.game.projection.heroProjection;

import com.hackathon.game.entity.HeroGuild;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "heroGuild",
        types = {HeroGuild.class})
public interface HeroGuildView {

    @Value("#{target.id}")
    Long getId();

    String getNameGuild();
}
