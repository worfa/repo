package com.hackathon.game.repository;

import com.hackathon.game.entity.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cluster", path = "cluster")
public interface ClusterRepository extends JpaRepository<Cluster, Long> {
}