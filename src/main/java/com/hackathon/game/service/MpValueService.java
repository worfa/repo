package com.hackathon.game.service;

import com.hackathon.game.entity.MpValue;
import com.hackathon.game.model.MpValueModel;
import com.hackathon.game.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MpValueService {

    private final MpValueRepository mpValueRepository;
    private final MutablePropertyRepository mutablePropertyRepository;
    private final HeroRepository heroRepository;
    private final MpEnumRepository enumRepository;
    private final SourceOfChengeRepository sourceOfChengeRepository;

    public void create(MpValueModel mpValueModel) {

        MpValue mpValue = convertToEntity(mpValueModel);
        mpValueRepository.saveAndFlush(mpValue);
    }

    private MpValue convertToEntity(MpValueModel mpValueModel){

        MpValue mpValue = new MpValue();

        mpValue.setNumberValue(mpValueModel.getNumberValue());
        mpValue.setDateTimeValue(mpValueModel.getDateTimeValue());
        mpValue.setStringValue(mpValueModel.getStringValue());
        mpValue.setActualityFlag(mpValueModel.getActualityFlag());
        mpValue.setDateBegin(mpValueModel.getDateBegin());
        mpValue.setDateEnd(mpValueModel.getDateEnd());
        mpValue.setMutableProperty(mutablePropertyRepository.findById(mpValueModel.getIdMutProp()).orElse(null));
        mpValue.setHero(heroRepository.findById(mpValueModel.getIdUser()).orElse(null));
        mpValue.setMpEnum(enumRepository.findById(mpValueModel.getIdEnumMp()).orElse(null));
        mpValue.setSourceOfChange(sourceOfChengeRepository.findById(mpValueModel.getIdSourceOfChange()).orElse(null));

        return mpValue;
    }
}
