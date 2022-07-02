package com.hackathon.game.repository;

import com.hackathon.game.entity.HeroRace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface HeroRaceRepository extends JpaRepository<HeroRace, Long> {
}