package com.hackathon.game.service;

import com.hackathon.game.entity.Cluster;
import com.hackathon.game.entity.Property;
import com.hackathon.game.entity.PropertyDefinition;
import com.hackathon.game.model.ClusterModel;
import com.hackathon.game.repository.ClusterRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClusterService {

    private final ModelMapper modelMapper;
    private final ClusterRepository clusterRepository;

    public void create(ClusterModel clusterModel) {
       Cluster cluster = modelMapper.map(clusterModel, Cluster.class);
       clusterRepository.saveAndFlush(cluster);
    }
}
