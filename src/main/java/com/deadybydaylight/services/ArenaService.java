package com.deadybydaylight.services;

import com.deadybydaylight.domain.Arena;
import com.deadybydaylight.dto.ArenaResponseDTO;
import com.deadybydaylight.mappers.GenericMapper;
import com.deadybydaylight.repositories.ArenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArenaService {

    @Autowired
    private ArenaRepository repository;

    public List<ArenaResponseDTO> getAll() {
        List<Arena> response = repository.findAll();
        return GenericMapper.mapList(response, ArenaResponseDTO.class);
    }
}
