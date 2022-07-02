package com.hackathon.game.service;

import com.hackathon.game.entity.PropertyValue;
import com.hackathon.game.model.PropertyValueModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropertyValueService {

    private final PropertyValueRepository propertyValueRepository;
    private final PropertyRepository propertyRepository;
    private final HeroRepository heroRepository;
    private final PropertyDefinitionRepository propertyDefinitionRepository;
    private final SourceOfChengeRepository sourceOfChengeRepository;

    public void create(PropertyValueModel mpValueModel) {
        PropertyValue mpValue = convertToEntity(mpValueModel);
        propertyValueRepository.saveAndFlush(mpValue);
    }

    private PropertyValue convertToEntity(PropertyValueModel propertyValueModel){

        PropertyValue propertyValue = new PropertyValue();

        propertyValue.setNumberValue(propertyValueModel.getNumberValue());
        propertyValue.setDateTimeValue(propertyValueModel.getDateTimeValue());
        propertyValue.setStringValue(propertyValueModel.getStringValue());
        propertyValue.setActualityFlag(propertyValueModel.getActualityFlag());
        propertyValue.setDateBegin(propertyValueModel.getDateBegin());
        propertyValue.setDateEnd(propertyValueModel.getDateEnd());
        propertyValue.setMutableProperty(propertyRepository.findById(propertyValueModel.getIdMutProp()).orElse(null));
        propertyValue.setHero(heroRepository.findById(propertyValueModel.getIdUser()).orElse(null));
        propertyValue.setPropertyDefinition(propertyDefinitionRepository.findById(propertyValueModel.getIdEnumMp()).orElse(null));
        propertyValue.setSourceOfChange(sourceOfChengeRepository.findById(propertyValueModel.getIdSourceOfChange()).orElse(null));

        return propertyValue;
    }
}
