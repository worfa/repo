package com.hackathon.game.repository;

import com.hackathon.game.entity.Cluster;
import com.hackathon.game.projection.clusterProjection.ClusterView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ClusterView.class, collectionResourceRel = "cluster", path = "cluster")
public interface ClusterRepository extends JpaRepository<Cluster, Long> {
}