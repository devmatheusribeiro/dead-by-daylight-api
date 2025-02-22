package com.deadybydaylight.controllers;

import com.deadybydaylight.constants.MappingConstants;
import com.deadybydaylight.dto.ArenaResponseDTO;
import com.deadybydaylight.services.ArenaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(MappingConstants.RequestConst.ARENA)
@RequiredArgsConstructor
public class ArenaController {
    private final ArenaService service;

    @GetMapping
    public List<ArenaResponseDTO> getAll() {
        return  service.getAll();
    }
}
