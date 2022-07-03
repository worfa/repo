package com.hackathon.game.controller;

import com.hackathon.game.entity.PropertyValue;
import com.hackathon.game.model.PropertyValueModel;
import com.hackathon.game.model.ValueUpdateModel;
import com.hackathon.game.service.PropertyValueService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RepositoryRestController
@RequiredArgsConstructor
public class PropertyValueController {

    private final PropertyValueService propertyValueService;

    @PostMapping(value = "/value", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void create(
            @RequestBody PropertyValueModel propertyValueModel) {
        propertyValueService.create(propertyValueModel);
    }

    @PostMapping(path = "/value", params = {"heroId", "beginDate", "sourceChangeId"})
    public List<PropertyValue> getValuesByHeroIdDateAndSourceChange(
            @RequestParam("heroId") Long heroId,
            @RequestParam("beginDate") String beginDate,
            @RequestParam("sourceChangeId") Long sourceChangeId) {

        return propertyValueService.getValuesByHeroIdDateAndSourceChange(
                heroId,
                beginDate,
                sourceChangeId
        );
    }

    @PutMapping(path = "/value", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void update(@RequestBody ValueUpdateModel valueUpdateModel ){
        propertyValueService.update();
    }
}
