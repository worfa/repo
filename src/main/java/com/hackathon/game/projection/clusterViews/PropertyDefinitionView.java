package com.hackathon.game.projection.clusterViews;

import com.hackathon.game.entity.PropertyDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "propertyDefinitionView",
        types = { PropertyDefinition.class })
public interface PropertyDefinitionView {

    @Value("#{target.id}")
    Long getId();

    String getNameEnum();
}
