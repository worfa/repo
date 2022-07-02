package com.hackathon.game.projection.clusterProjection;

import com.hackathon.game.entity.Cluster;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "clusterView",
        types = { Cluster.class })
public interface ClusterView {

    @Value("#{target.id}")
    Long getId();

    String getNameCluster();

    String getDefinition();

    List<PropertyView> getProperties();
}
