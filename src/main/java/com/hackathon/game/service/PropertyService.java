package com.hackathon.game.service;

import com.hackathon.game.entity.Property;
import com.hackathon.game.model.PropertyModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropertyService {

    private final ClusterRepository clusterRepository;
    private final PropertyRepository propertyRepository;
    private final ModelMapper modelMapper;

    public void create(PropertyModel propertyModel) {
        Property property = modelMapper.map(propertyModel, Property.class);
        property.setCluster(clusterRepository.findById(propertyModel.getIdCluster()).orElse(null));
        propertyRepository.saveAndFlush(property);
    }

    public Long create (PropertyModel propertyModel, Long idCluster) {
        Property property = modelMapper.map(propertyModel, Property.class);
        property.setCluster(clusterRepository.findById(idCluster).orElse(null));
        propertyRepository.saveAndFlush(property);
        return propertyRepository.findTopByOrderByIdDesc().getId();
    }

    public void update (PropertyModel propertyModel, Long idProperty) {
        Property property = modelMapper.map(propertyModel, Property.class);
        Property propertyOfBd = propertyRepository.findById(idProperty).orElse(null);
        modelMapper.map(property, propertyOfBd);
        propertyRepository.saveAndFlush(propertyOfBd);
    }
}
