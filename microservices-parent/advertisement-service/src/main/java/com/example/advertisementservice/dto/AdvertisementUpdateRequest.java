package com.example.advertisementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AdvertisementUpdateRequest {
    private String title;
    private String description;
    private Integer viewCount;
    private Boolean isActive;
    private LocalDateTime updatedAt;
}
