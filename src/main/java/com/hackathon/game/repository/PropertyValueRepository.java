package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "value", path = "value")
public interface PropertyValueRepository extends JpaRepository<PropertyValue, Long> {
}