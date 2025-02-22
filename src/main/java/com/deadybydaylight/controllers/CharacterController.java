package com.deadybydaylight.controllers;

import com.deadybydaylight.constants.MappingConstants;
import com.deadybydaylight.dto.CharacterResponseDTO;
import com.deadybydaylight.services.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(MappingConstants.RequestConst.CHARACTER)
@RequiredArgsConstructor
public class CharacterController {
    private final CharacterService service;

    @GetMapping
    List<CharacterResponseDTO> getAllByRole(@RequestParam("role") String roleName) {
        return service.getAllByRole(roleName);
    }
;}
