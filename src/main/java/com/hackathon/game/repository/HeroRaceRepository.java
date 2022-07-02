package com.hackathon.game.repository;

import com.hackathon.game.entity.HeroRace;
import com.hackathon.game.projection.heroProjection.HeroClassView;
import com.hackathon.game.projection.heroProjection.HeroRaceView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(excerptProjection = HeroRaceView.class)
public interface HeroRaceRepository extends JpaRepository<HeroRace, Long> {
}