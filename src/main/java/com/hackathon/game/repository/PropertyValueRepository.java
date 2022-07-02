package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(collectionResourceRel = "value", path = "value")
public interface PropertyValueRepository extends JpaRepository<PropertyValue, Long> {
}