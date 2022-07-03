package com.hackathon.game.controller;

import com.hackathon.game.entity.PropertyValue;
import com.hackathon.game.model.PropertyValueModel;
import com.hackathon.game.service.PropertyValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    @GetMapping(value = "/value/findByHeroAndBeginDateAndSourceChange")
    public List<PropertyValue> getValuesForHeroBySourceChangeAndDate(
            @RequestParam Long heroId,
            @RequestParam String beginDate,
            @RequestParam Long sourceChangeId) {

        return propertyValueService.findValuesByUserIdDateAndSourceChange(
                heroId,
                beginDate,
                sourceChangeId
        );
    }
}
