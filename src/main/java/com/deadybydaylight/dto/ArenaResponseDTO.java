package com.deadybydaylight.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArenaResponseDTO {
    Long id;
    String name;
    ImageResponseDTO image;
}
