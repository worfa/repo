package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyValueRepository extends JpaRepository<PropertyValue, Long> {
}