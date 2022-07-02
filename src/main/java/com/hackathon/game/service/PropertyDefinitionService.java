package com.hackathon.game.service;

import com.hackathon.game.entity.PropertyDefinition;
import com.hackathon.game.model.PropertyDefinitionModel;
import com.hackathon.game.repository.PropertyRepository;
import com.hackathon.game.repository.PropertyDefinitionRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropertyDefinitionService {

    private final PropertyDefinitionRepository propertyDefinitionRepository;
    private final PropertyRepository propertyRepository;
    private final ModelMapper modelMapper;

    public Long create(PropertyDefinitionModel propertyDefinitionModel) {
        PropertyDefinition propertyDefinition = modelMapper.map(propertyDefinitionModel, PropertyDefinition.class);
        propertyDefinition.setProperties(propertyRepository.findById(propertyDefinitionModel.getIdMutProp()).orElse(null));
        propertyDefinitionRepository.saveAndFlush(propertyDefinition);
        return propertyDefinitionRepository.findTopByOrderByIdDesc().getId();
    }

    public Long create(PropertyDefinitionModel propertyDefinitionModel, Long idProperty){
        PropertyDefinition propertyDefinition = modelMapper.map(propertyDefinitionModel, PropertyDefinition.class);
        propertyDefinition.setProperties(propertyRepository.findById(idProperty).orElse(null));
        propertyDefinitionRepository.saveAndFlush(propertyDefinition);
        return propertyDefinitionRepository.findTopByOrderByIdDesc().getId();
    }
}
