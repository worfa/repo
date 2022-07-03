package com.hackathon.game.projection.clusterProjection;

import com.hackathon.game.entity.PropertyValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "propertyValueView",
        types = { PropertyValue.class })
public interface PropertyValueView {

    @Value("#{target.id}")
    Long getId();

    LocalDate getDateEnd();

    LocalDate getDateBegin();

    Boolean getActualityFlag();

    LocalDate getDateTimeValue();

    Long getNumberValue();

    String getStringValue();

}
