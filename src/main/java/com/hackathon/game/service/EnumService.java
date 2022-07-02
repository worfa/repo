package com.hackathon.game.service;

import com.hackathon.game.entity.MpEnum;
import com.hackathon.game.entity.MutableProperty;
import com.hackathon.game.model.MpEnumModel;
import com.hackathon.game.model.MutablePropertyModel;
import com.hackathon.game.repository.MpEnumRepository;
import com.hackathon.game.repository.MutablePropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnumService {

    private final MpEnumRepository mpEnumRepository;
    private final MutablePropertyRepository mutablePropertyRepository;

    public void create(MpEnumModel mpEnumModel) {

        MpEnum mpEnum = convertToEntity(mpEnumModel);
        mpEnumRepository.saveAndFlush(mpEnum);
    }

    private MpEnum convertToEntity(MpEnumModel mpEnumModel){

        MpEnum mpEnum = new MpEnum();

        mpEnum.setNameEnum(mpEnumModel.getNameEnum());
        mpEnum.setMutProp(mutablePropertyRepository.findById(mpEnumModel.getIdMutProp()).orElse(null));

        return mpEnum;
    }

}
