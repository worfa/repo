package com.hackathon.game.projection.clusterProjection;

import com.hackathon.game.entity.Property;
import com.hackathon.game.projection.propertyValueProjection.PropertyValueView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "propertyView",
        types = { Property.class })
public interface PropertyView {

    @Value("#{target.id}")
    Long getId();

    String getNameProp();

    String getTypeofMp();

    List<PropertyDefinitionView> getPropertyDefinitions();

    List<PropertyValueView> getPropertyValues();
}
