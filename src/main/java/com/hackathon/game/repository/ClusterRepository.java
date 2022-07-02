package com.hackathon.game.repository;

import com.hackathon.game.entity.Cluster;
import com.hackathon.game.projection.clusterProjection.ClusterView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(excerptProjection = ClusterView.class, collectionResourceRel = "cluster", path = "cluster")
public interface ClusterRepository extends JpaRepository<Cluster, Long> {
}