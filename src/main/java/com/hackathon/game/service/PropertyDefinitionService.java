package com.hackathon.game.service;

import com.hackathon.game.entity.PropertyDefinition;
import com.hackathon.game.model.PropertyDefinitionModel;
import com.hackathon.game.repository.PropertyRepository;
import com.hackathon.game.repository.PropertyDefinitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropertyDefinitionService {

    private final PropertyDefinitionRepository propertyDefinitionRepository;
    private final PropertyRepository propertyRepository;

    public void create(PropertyDefinitionModel mpEnumModel) {

        PropertyDefinition mpEnum = convertToEntity(mpEnumModel);
        propertyDefinitionRepository.saveAndFlush(mpEnum);
    }

    private PropertyDefinition convertToEntity(PropertyDefinitionModel propertyDefinitionModel){

        PropertyDefinition propertyDefinition = new PropertyDefinition();

        propertyDefinition.setNameEnum(propertyDefinitionModel.getNameEnum());
        propertyDefinition.setProperties(propertyRepository.findById(propertyDefinitionModel.getIdMutProp()).orElse(null));

        return propertyDefinition;
    }

}
