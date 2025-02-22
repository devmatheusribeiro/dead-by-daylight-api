package com.deadybydaylight.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ImageResponseDTO {
    Long id;
    String description;
    String url;
    String fallbackUrl;
}
