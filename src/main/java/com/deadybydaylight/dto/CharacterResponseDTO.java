package com.deadybydaylight.dto;

import com.deadybydaylight.domain.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CharacterResponseDTO {
    Long id;
    String name;
    RoleResponseDTO role;
    ImageResponseDTO image;
}
