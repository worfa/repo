package com.hackathon.game.repository;

import com.hackathon.game.entity.MutableProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MutablePropertyRepository extends JpaRepository<MutableProperty, Long> {
}