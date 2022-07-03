package com.hackathon.game.projection.propertyValueProjection;

import com.hackathon.game.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "propertyValueView", types = {PropertyValue.class})
public interface PropertyValueView {

    @Value("#{target.id}")
    Long getId();

    LocalDate getDateBegin();

    Boolean getActualityFlag();

    String getStringValue();

    Long getNumberValue();

    LocalDate getDateTimeValue();

    PropertyDefinition getPropertyDefinition();

    Hero getHero();

    Property getProperty();

    SourceOfChange getSourceOfChange();
}
