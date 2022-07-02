package com.hackathon.game.service;

import com.hackathon.game.entity.Property;
import com.hackathon.game.model.MutablePropertyModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropertyService {

    private final ClusterRepository clusterRepository;
    private final PropertyRepository propertyRepository;

    public void create(MutablePropertyModel mutablePropertyModel) {

        Property mutableProperty = convertToEntity(mutablePropertyModel);
        propertyRepository.saveAndFlush(mutableProperty);
    }

    private Property convertToEntity(MutablePropertyModel mutablePropertyModel){

        Property mutableProperty = new Property();

        mutableProperty.setNameProp(mutablePropertyModel.getNameProp());
        mutableProperty.setCluster(clusterRepository.findById(mutablePropertyModel.getIdCluster()).orElse(null));
        mutableProperty.setTypeofMp(mutablePropertyModel.getTypeofMp());

        return mutableProperty;
    }

}
