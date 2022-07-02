package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDefinitionRepository extends JpaRepository<PropertyDefinition, Long> {
}