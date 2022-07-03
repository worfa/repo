package com.hackathon.game.service;

import com.hackathon.game.entity.Cluster;
import com.hackathon.game.model.ClusterModel;
import com.hackathon.game.repository.ClusterRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClusterService {

    private final ModelMapper modelMapper;
    private final ClusterRepository clusterRepository;

    public Long create(ClusterModel clusterModel) {
       Cluster cluster = modelMapper.map(clusterModel, Cluster.class);
       clusterRepository.saveAndFlush(cluster);
       return clusterRepository.findTopByOrderByIdDesc().getId();
    }

    public void update(ClusterModel clusterModel, Long idCluster) {
        Cluster clusterOfBd = clusterRepository.findById(idCluster).orElse(null);
        modelMapper.map(clusterModel, clusterOfBd);
        clusterRepository.saveAndFlush(clusterOfBd);
    }
}
