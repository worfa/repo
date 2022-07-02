package com.hackathon.game.repository;

import com.hackathon.game.entity.Property;
import com.hackathon.game.projection.clusterProjection.PropertyView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(excerptProjection = PropertyView.class ,collectionResourceRel = "property", path = "property")
public interface PropertyRepository extends JpaRepository<Property, Long> {

    Property findTopByOrderByIdDesc();
}