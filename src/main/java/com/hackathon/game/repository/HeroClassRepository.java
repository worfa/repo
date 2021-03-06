package com.hackathon.game.repository;

import com.hackathon.game.entity.HeroClass;
import com.hackathon.game.projection.clusterProjection.ClusterView;
import com.hackathon.game.projection.heroProjection.HeroClassView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(excerptProjection = HeroClassView.class)
public interface HeroClassRepository extends JpaRepository<HeroClass, Long> {
}