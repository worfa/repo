package com.hackathon.game.projection;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.entity.PropertyValue;
import com.hackathon.game.projection.clusterProjection.PropertyView;
import com.hackathon.game.projection.heroProjection.HeroView;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "heroClusterView", types = {PropertyValue.class})
public interface HeroClusterView {

    HeroView getHero();

    PropertyView getProperty();

}
