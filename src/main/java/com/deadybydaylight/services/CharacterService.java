package com.deadybydaylight.services;

import com.deadybydaylight.domain.Character;
import com.deadybydaylight.dto.CharacterResponseDTO;
import com.deadybydaylight.mappers.GenericMapper;
import com.deadybydaylight.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository repository;

    public List<CharacterResponseDTO> getAllByRole(String roleName) {
        List<Character> response = repository.findAllByRole_Name(roleName);
        return GenericMapper.mapList(response, CharacterResponseDTO.class);
    }
}
