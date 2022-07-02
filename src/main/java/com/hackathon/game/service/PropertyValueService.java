package com.hackathon.game.service;

import com.hackathon.game.entity.PropertyValue;
import com.hackathon.game.model.PropertyValueModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropertyValueService {

    private final PropertyValueRepository propertyValueRepository;
    private final PropertyRepository propertyRepository;
    private final HeroRepository heroRepository;
    private final PropertyDefinitionRepository propertyDefinitionRepository;
    private final SourceOfChengeRepository sourceOfChengeRepository;
    private final ModelMapper modelMapper;

    public void create(PropertyValueModel propertyValueModel) {
        PropertyValue propertyValue = modelMapper.map(propertyValueModel, PropertyValue.class);
        propertyValue.setMutableProperty(propertyRepository.findById(propertyValueModel.getIdMutProp()).orElse(null));
        propertyValue.setHero(heroRepository.findById(propertyValueModel.getIdUser()).orElse(null));
        propertyValue.setPropertyDefinition(propertyDefinitionRepository.findById(propertyValueModel.getIdEnumMp()).orElse(null));
        propertyValue.setSourceOfChange(sourceOfChengeRepository.findById(propertyValueModel.getIdSourceOfChange()).orElse(null));
        propertyValueRepository.saveAndFlush(propertyValue);
    }
}
