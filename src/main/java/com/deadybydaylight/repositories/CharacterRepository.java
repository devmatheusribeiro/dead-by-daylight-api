package com.deadybydaylight.repositories;

import com.deadybydaylight.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findAllByRole_Name(String roleName);
}
