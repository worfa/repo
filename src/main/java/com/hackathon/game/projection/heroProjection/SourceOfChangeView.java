package com.hackathon.game.projection.heroProjection;

import com.hackathon.game.entity.SourceOfChange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "sourceOfChangeView",
        types = { SourceOfChange.class })
public interface SourceOfChangeView {

    @Value("#{target.id}")
    Long getId();

    String getNameSource();

}
