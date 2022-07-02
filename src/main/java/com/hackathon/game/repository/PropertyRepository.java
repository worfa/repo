package com.hackathon.game.repository;

import com.hackathon.game.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "property", path = "property")
public interface PropertyRepository extends JpaRepository<Property, Long> {
}