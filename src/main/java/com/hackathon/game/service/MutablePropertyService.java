package com.hackathon.game.service;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.entity.MutableProperty;
import com.hackathon.game.model.MutablePropertyModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MutablePropertyService {

    private final MpClusterRepository mpClusterRepository;
    private final MutablePropertyRepository mutablePropertyRepository;

    public void create(MutablePropertyModel mutablePropertyModel) {

        MutableProperty mutableProperty = convertToEntity(mutablePropertyModel);
        mutablePropertyRepository.saveAndFlush(mutableProperty);
    }

    private MutableProperty convertToEntity(MutablePropertyModel mutablePropertyModel){

        MutableProperty mutableProperty = new MutableProperty();

        mutableProperty.setNameProp(mutablePropertyModel.getNameProp());
        mutableProperty.setMpCluster(mpClusterRepository.findById(mutablePropertyModel.getIdCluster()).orElse(null));
        mutableProperty.setTypeofMp(mutablePropertyModel.getTypeofMp());

        return mutableProperty;
    }

}
