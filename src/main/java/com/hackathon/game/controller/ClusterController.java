package com.hackathon.game.controller;

import com.hackathon.game.model.ClusterModel;
import com.hackathon.game.model.PropertyModel;
import com.hackathon.game.service.ClusterService;
import com.hackathon.game.service.PropertyDefinitionService;
import com.hackathon.game.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequiredArgsConstructor
public class ClusterController {

    private final ClusterService clusterService;
    private final PropertyService propertyService;

    @PostMapping(value = "/cluster", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public Long create (
            @RequestBody ClusterModel clusterModel) {
        return clusterService.create(clusterModel);
    }

    @PostMapping(value = "/cluster/{id}/properties", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public Long createClusterProperty(@RequestBody PropertyModel propertyModel, @PathVariable Long id) {
        return propertyService.create(propertyModel, id);
    }

    @PutMapping(value = "/cluster/{id}", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void updateClusterProperty (@RequestBody ClusterModel clusterModel, @PathVariable Long id) {
        clusterService.update(clusterModel, id);
    }

}
